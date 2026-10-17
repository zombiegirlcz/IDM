package androidx.camera.video;

/* JADX INFO: loaded from: classes15.dex */
public abstract class FallbackStrategy {
    static final FallbackStrategy NONE = new AutoValue_FallbackStrategy_RuleStrategy(Quality.NONE, 0);

    public static abstract class RuleStrategy extends FallbackStrategy {
        public RuleStrategy() {
            super();
        }

        public abstract Quality getFallbackQuality();

        public abstract int getFallbackRule();
    }

    public static FallbackStrategy higherQualityOrLowerThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 1);
    }

    public static FallbackStrategy lowerQualityOrHigherThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 3);
    }

    private FallbackStrategy() {
    }
}
