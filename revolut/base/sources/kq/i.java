package kq;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkq/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "id", "", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "userSettings", "", "Z", "getForceReloadRequired", "()Z", "forceReloadRequired", "appwidget_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userSettings")
    @NotNull
    private final Map<String, String> userSettings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("forceReloadRequired")
    private final boolean forceReloadRequired;

    public i(int i, Map userSettings, boolean z) {
        Intrinsics.checkNotNullParameter(userSettings, "userSettings");
        this.id = i;
        this.userSettings = userSettings;
        this.forceReloadRequired = z;
    }

    public static i a(i iVar, Map userSettings) {
        int i = iVar.id;
        boolean z = iVar.forceReloadRequired;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(userSettings, "userSettings");
        return new i(i, userSettings, z);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getUserSettings() {
        return this.userSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.id == iVar.id && Intrinsics.f(this.userSettings, iVar.userSettings) && this.forceReloadRequired == iVar.forceReloadRequired;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.forceReloadRequired) + p.a.e(Integer.hashCode(this.id) * 31, 31, this.userSettings);
    }
}
