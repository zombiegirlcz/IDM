package androidx.camera.video;

import android.location.Location;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public abstract class OutputOptions {
    private final OutputOptionsInternal mOutputOptionsInternal;

    public static abstract class Builder<T extends OutputOptions, B> {
        final OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        public Builder(OutputOptionsInternal.Builder<?> builder) {
            this.mRootInternalBuilder = builder;
            builder.setFileSizeLimit(0L);
            builder.setDurationLimitMillis(0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setDurationLimitMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "The specified duration limit can't be negative.");
            this.mRootInternalBuilder.setDurationLimitMillis(j2);
            return this;
        }
    }

    public static abstract class OutputOptionsInternal {

        public static abstract class Builder<B> {
            public abstract B setDurationLimitMillis(long j2);

            public abstract B setFileSizeLimit(long j2);
        }

        public abstract long getDurationLimitMillis();

        public abstract long getFileSizeLimit();

        public abstract Location getLocation();
    }

    public OutputOptions(OutputOptionsInternal outputOptionsInternal) {
        this.mOutputOptionsInternal = outputOptionsInternal;
    }

    public long getDurationLimitMillis() {
        return this.mOutputOptionsInternal.getDurationLimitMillis();
    }

    public long getFileSizeLimit() {
        return this.mOutputOptionsInternal.getFileSizeLimit();
    }

    public Location getLocation() {
        return this.mOutputOptionsInternal.getLocation();
    }
}
