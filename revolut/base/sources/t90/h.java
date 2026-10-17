package t90;

import ce9.m;
import com.revolut.feature.backend_flow.domain.models.BackendIconType;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f268941a = r0.k(new Pair("CandlestickChart", BackendIconType.CandlestickChart.f63299a), new Pair("Cash", BackendIconType.Cash.f63300a), new Pair("Coins", BackendIconType.Coins.f63301a), new Pair("Document", BackendIconType.Document.f63302a), new Pair("Flag", BackendIconType.Flag.f63303a), new Pair("Laptop", BackendIconType.Laptop.f63304a), new Pair("Lightning", BackendIconType.Lightning.f63305a), new Pair("NationalId", BackendIconType.NationalId.f63306a), new Pair("People", BackendIconType.People.f63307a), new Pair("Percent", BackendIconType.Percent.f63308a), new Pair("Pin", BackendIconType.Pin.f63309a), new Pair("Profile", BackendIconType.Profile.f63310a), new Pair("RepairTool", BackendIconType.RepairTool.f63311a), new Pair("SandWatch", BackendIconType.SandWatch.f63312a), new Pair("SavingsVault", BackendIconType.SavingsVault.f63313a), new Pair("Security", BackendIconType.Security.f63314a), new Pair("Services", BackendIconType.Services.f63315a), new Pair("Umbrella", BackendIconType.Umbrella.f63316a), new Pair("Vault", BackendIconType.Vault.f63318a), new Pair("Warning", BackendIconType.Warning.f63319a), new Pair("Wealth", BackendIconType.Wealth.f63320a));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final BackendIconType a(String icon) throws Throwable {
        Intrinsics.checkNotNullParameter(icon, "icon");
        BackendIconType backendIconType = (BackendIconType) this.f268941a.get(icon);
        if (backendIconType != null) {
            return backendIconType;
        }
        hx7.e.n(new IllegalArgumentException(j6.a.q("Unsupported icon type ", icon)));
        return new BackendIconType.Unknown(icon);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String b(BackendIconType icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        String strJ = m.j(this.f268941a, icon);
        return strJ == null ? ((BackendIconType.Unknown) icon).f63317a : strJ;
    }
}
