package androidx.media3.extractor;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Extractor {
    default List<SniffFailure> getSniffFailureDetails() {
        return ImmutableList.of();
    }

    default Extractor getUnderlyingImplementation() {
        return this;
    }

    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException;

    void release();

    void seek(long j2, long j3);

    boolean sniff(ExtractorInput extractorInput) throws IOException;
}
