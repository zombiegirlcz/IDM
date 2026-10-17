package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b\u0005\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\u0018\u0010,¨\u0006."}, d2 = {"Lkfj/w2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "k", "state", "Lkfj/y2;", "c", "Lkfj/y2;", "f", "()Lkfj/y2;", "installationConfirmation", "d", "deviceId", "hardwareId", "i", "ownerUsername", "Lkfj/v2;", "g", "Lkfj/v2;", "()Lkfj/v2;", "details", "Lkfj/l0;", "h", "Lkfj/l0;", "()Lkfj/l0;", "migrationFromDataPlansOnly", "Lkfj/u2;", "Lkfj/u2;", "()Lkfj/u2;", "apn", "Lkfj/a3;", "j", "Lkfj/a3;", "()Lkfj/a3;", "scope", "Lkfj/z2;", "Lkfj/z2;", "()Lkfj/z2;", "lock", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("installationConfirmation")
    private final y2 installationConfirmation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("hardwareId")
    private final String hardwareId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ownerUsername")
    private final String ownerUsername;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final v2 details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("migrationFromDataPlansOnly")
    private final l0 migrationFromDataPlansOnly;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("apn")
    private final u2 apn;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("scope")
    private final a3 scope;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("lock")
    private final z2 lock;

    public w2(String id10, String state, y2 y2Var, String str, String str2, String str3, v2 v2Var, l0 l0Var, u2 u2Var, a3 a3Var, z2 z2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.state = state;
        this.installationConfirmation = y2Var;
        this.deviceId = str;
        this.hardwareId = str2;
        this.ownerUsername = str3;
        this.details = v2Var;
        this.migrationFromDataPlansOnly = l0Var;
        this.apn = u2Var;
        this.scope = a3Var;
        this.lock = z2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u2 getApn() {
        return this.apn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v2 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHardwareId() {
        return this.hardwareId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.id, w2Var.id) && Intrinsics.f(this.state, w2Var.state) && Intrinsics.f(this.installationConfirmation, w2Var.installationConfirmation) && Intrinsics.f(this.deviceId, w2Var.deviceId) && Intrinsics.f(this.hardwareId, w2Var.hardwareId) && Intrinsics.f(this.ownerUsername, w2Var.ownerUsername) && Intrinsics.f(this.details, w2Var.details) && Intrinsics.f(this.migrationFromDataPlansOnly, w2Var.migrationFromDataPlansOnly) && Intrinsics.f(this.apn, w2Var.apn) && Intrinsics.f(this.scope, w2Var.scope) && Intrinsics.f(this.lock, w2Var.lock);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final y2 getInstallationConfirmation() {
        return this.installationConfirmation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final z2 getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l0 getMigrationFromDataPlansOnly() {
        return this.migrationFromDataPlansOnly;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
        y2 y2Var = this.installationConfirmation;
        int iHashCode = (iC + (y2Var == null ? 0 : y2Var.hashCode())) * 31;
        String str = this.deviceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hardwareId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerUsername;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v2 v2Var = this.details;
        int iHashCode5 = (iHashCode4 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        l0 l0Var = this.migrationFromDataPlansOnly;
        int iHashCode6 = (iHashCode5 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        u2 u2Var = this.apn;
        int iHashCode7 = (iHashCode6 + (u2Var == null ? 0 : u2Var.hashCode())) * 31;
        a3 a3Var = this.scope;
        int iHashCode8 = (iHashCode7 + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        z2 z2Var = this.lock;
        return iHashCode8 + (z2Var != null ? z2Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOwnerUsername() {
        return this.ownerUsername;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a3 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
