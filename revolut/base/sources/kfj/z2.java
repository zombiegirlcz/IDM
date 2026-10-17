package kfj;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lkfj/z2;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "locked", "lockable", "c", "d", "unlockable", "transferToCurrentDeviceIsAvailable", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locked")
    private final boolean locked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockable")
    private final boolean lockable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockable")
    private final boolean unlockable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transferToCurrentDeviceIsAvailable")
    private final boolean transferToCurrentDeviceIsAvailable;

    public z2(boolean z, boolean z3, boolean z4, boolean z6) {
        this.locked = z;
        this.lockable = z3;
        this.unlockable = z4;
        this.transferToCurrentDeviceIsAvailable = z6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getLockable() {
        return this.lockable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getTransferToCurrentDeviceIsAvailable() {
        return this.transferToCurrentDeviceIsAvailable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUnlockable() {
        return this.unlockable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.locked == z2Var.locked && this.lockable == z2Var.lockable && this.unlockable == z2Var.unlockable && this.transferToCurrentDeviceIsAvailable == z2Var.transferToCurrentDeviceIsAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.transferToCurrentDeviceIsAvailable) + j6.a.c(j6.a.c(Boolean.hashCode(this.locked) * 31, 31, this.lockable), 31, this.unlockable);
    }
}
