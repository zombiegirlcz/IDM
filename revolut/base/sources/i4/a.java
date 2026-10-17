package i4;

import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158264a;

    public /* synthetic */ a(int i) {
        this.f158264a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f158264a) {
            case 0:
                return CueGroup.lambda$static$0((Cue) obj2);
            case 1:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj2);
            case 2:
                return new DefaultAnalyticsCollector((Clock) obj2);
            default:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj2);
        }
    }
}
