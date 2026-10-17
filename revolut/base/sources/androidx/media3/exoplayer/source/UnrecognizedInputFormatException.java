package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.SniffFailure;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<SniffFailure> sniffFailures;

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    public final Uri f7582uri;

    public UnrecognizedInputFormatException(String str, Uri uri2, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.f7582uri = uri2;
        this.sniffFailures = ImmutableList.copyOf((Collection) list);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        StringBuilder sbL = v0.a.l(message, "\nsniff failures: ");
        sbL.append(this.sniffFailures);
        return sbL.toString();
    }
}
