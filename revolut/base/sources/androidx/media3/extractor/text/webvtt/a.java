package androidx.media3.extractor.text.webvtt;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7641a;

    public /* synthetic */ a(int i) {
        this.f7641a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f7641a) {
            case 0:
                return WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj2, (WebvttCueParser.Element) obj3);
            default:
                return WebvttSubtitle.lambda$getCues$0((WebvttCueInfo) obj2, (WebvttCueInfo) obj3);
        }
    }
}
