package androidx.media3.extractor.heif;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HeifExtractor implements Extractor {
    private final boolean extractImage;
    private final Extractor extractor;

    public HeifExtractor(int i) {
        boolean z = (i & 1) != 0;
        this.extractImage = z;
        if (z) {
            this.extractor = new SingleSampleExtractor(-1, -1, "image/heif");
        } else {
            this.extractor = new HeicMotionPhotoExtractor();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.extractor.seek(j2, j3);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return this.extractImage ? HeifSniffer.sniff(extractorInput, false) : this.extractor.sniff(extractorInput);
    }
}
