package ymi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f315015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f315016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f315017c;

    public i(ArrayList accounts, ArrayList scopes, g client) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f315015a = accounts;
        this.f315016b = scopes;
        this.f315017c = client;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f315015a.equals(iVar.f315015a) && this.f315016b.equals(iVar.f315016b) && this.f315017c.equals(iVar.f315017c);
    }

    public final int hashCode() {
        return this.f315017c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f315016b, this.f315015a.hashCode() * 31, 31);
    }
}
