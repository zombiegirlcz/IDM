package h5;

import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.exoplayer.hls.DefaultHlsExtractorFactory;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149407a;

    public /* synthetic */ a(int i) {
        this.f149407a = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj2) {
        switch (this.f149407a) {
            case 0:
                return Mp3Extractor.lambda$getId3TlenUs$2((TextInformationFrame) obj2);
            case 1:
                return Mp4Extractor.lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4((MdtaMetadataEntry) obj2);
            case 2:
                return Mp4Extractor.lambda$shouldSeekToAxteAtom$3((MdtaMetadataEntry) obj2);
            case 3:
                return Mp4Extractor.lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5((MdtaMetadataEntry) obj2);
            default:
                return DefaultHlsExtractorFactory.lambda$isFmp4Variant$0((HlsTrackMetadataEntry) obj2);
        }
    }
}
