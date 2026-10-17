package zcj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0006\u0010\u0004R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lzcj/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "totalBullishSignals", "b", "e", "totalNeutralSignals", "c", "totalBearishSignals", "Ljava/lang/String;", "sentiment", "", "Lzcj/f;", "Ljava/util/List;", "()Ljava/util/List;", "signals", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalBullishSignals")
    private final int totalBullishSignals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalNeutralSignals")
    private final int totalNeutralSignals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalBearishSignals")
    private final int totalBearishSignals;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sentiment")
    @NotNull
    private final String sentiment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("signals")
    @NotNull
    private final List<f> signals;

    public e(int i, int i2, int i3, String sentiment, ArrayList signals) {
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.totalBullishSignals = i;
        this.totalNeutralSignals = i2;
        this.totalBearishSignals = i3;
        this.sentiment = sentiment;
        this.signals = signals;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSentiment() {
        return this.sentiment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSignals() {
        return this.signals;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalBearishSignals() {
        return this.totalBearishSignals;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalBullishSignals() {
        return this.totalBullishSignals;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotalNeutralSignals() {
        return this.totalNeutralSignals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.totalBullishSignals == eVar.totalBullishSignals && this.totalNeutralSignals == eVar.totalNeutralSignals && this.totalBearishSignals == eVar.totalBearishSignals && Intrinsics.f(this.sentiment, eVar.sentiment) && Intrinsics.f(this.signals, eVar.signals);
    }

    public final int hashCode() {
        return this.signals.hashCode() + p.a.c(j6.a.b(this.totalBearishSignals, j6.a.b(this.totalNeutralSignals, Integer.hashCode(this.totalBullishSignals) * 31, 31), 31), 31, this.sentiment);
    }
}
