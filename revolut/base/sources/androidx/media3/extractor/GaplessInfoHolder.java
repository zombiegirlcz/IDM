package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import com.google.common.base.Predicate;
import com.google.common.collect.UnmodifiableIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$0(CommentFrame commentFrame) {
        return commentFrame.description.equals("iTunSMPB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$1(InternalFrame internalFrame) {
        return internalFrame.domain.equals("com.apple.iTunes") && internalFrame.description.equals("iTunSMPB");
    }

    private boolean setFromComment(String str) {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) Util.castNonNull(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.encoderDelay = i;
            this.encoderPadding = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean setFromMetadata(Metadata metadata) {
        final int i = 0;
        UnmodifiableIterator it8 = metadata.getMatchingEntries(CommentFrame.class, new Predicate() { // from class: a5.c
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj2) {
                switch (i) {
                    case 0:
                        return GaplessInfoHolder.lambda$setFromMetadata$0((CommentFrame) obj2);
                    default:
                        return GaplessInfoHolder.lambda$setFromMetadata$1((InternalFrame) obj2);
                }
            }
        }).iterator();
        while (it8.hasNext()) {
            if (setFromComment(((CommentFrame) it8.next()).text)) {
                return true;
            }
        }
        final int i2 = 1;
        UnmodifiableIterator it9 = metadata.getMatchingEntries(InternalFrame.class, new Predicate() { // from class: a5.c
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj2) {
                switch (i2) {
                    case 0:
                        return GaplessInfoHolder.lambda$setFromMetadata$0((CommentFrame) obj2);
                    default:
                        return GaplessInfoHolder.lambda$setFromMetadata$1((InternalFrame) obj2);
                }
            }
        }).iterator();
        while (it9.hasNext()) {
            if (setFromComment(((InternalFrame) it9.next()).text)) {
                return true;
            }
        }
        return false;
    }
}
