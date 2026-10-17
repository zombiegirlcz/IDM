package androidx.camera.video;

import androidx.camera.video.FallbackStrategy;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends FallbackStrategy.RuleStrategy {
    private final Quality fallbackQuality;
    private final int fallbackRule;

    public AutoValue_FallbackStrategy_RuleStrategy(Quality quality, int i) {
        if (quality == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.fallbackQuality = quality;
        this.fallbackRule = i;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof FallbackStrategy.RuleStrategy) {
            FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) obj2;
            if (this.fallbackQuality.equals(ruleStrategy.getFallbackQuality()) && this.fallbackRule == ruleStrategy.getFallbackRule()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public Quality getFallbackQuality() {
        return this.fallbackQuality;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public int getFallbackRule() {
        return this.fallbackRule;
    }

    public int hashCode() {
        return ((this.fallbackQuality.hashCode() ^ 1000003) * 1000003) ^ this.fallbackRule;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb6.append(this.fallbackQuality);
        sb6.append(", fallbackRule=");
        return j6.a.v(sb6, "}", this.fallbackRule);
    }
}
