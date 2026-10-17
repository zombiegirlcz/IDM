package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.c1 f142702a = (ecm.c1) Preconditions.checkNotNull(ecm.c1.a(), "registry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142703b;

    public k(String str) {
        this.f142703b = (String) Preconditions.checkNotNull(str, "defaultPolicy");
    }
}
