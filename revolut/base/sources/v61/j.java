package v61;

import com.revolut.core.model.account.AccountId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f286300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f286301c;
    public final AccountId.Joint d;

    public j(String str, List items, ArrayList moneyRequests, AccountId.Joint joint) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.f286299a = str;
        this.f286300b = items;
        this.f286301c = moneyRequests;
        this.d = joint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f286299a, jVar.f286299a) && Intrinsics.f(this.f286300b, jVar.f286300b) && this.f286301c.equals(jVar.f286301c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        String str = this.f286299a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f286301c, p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f286300b), 31);
        AccountId.Joint joint = this.d;
        return iB + (joint != null ? joint.hashCode() : 0);
    }
}
