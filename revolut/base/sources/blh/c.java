package blh;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zsc.m f16640b;

    public c(zsc.m query, int i) {
        this.f16639a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(query, "query");
                this.f16640b = query;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(query, "query");
                this.f16640b = query;
                break;
            default:
                Intrinsics.checkNotNullParameter(query, "query");
                this.f16640b = query;
                break;
        }
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        switch (this.f16639a) {
            case 0:
                nel.n value = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value.f214600j;
                if (str == null) {
                    return false;
                }
                ArrayList arrayList = this.f16640b.f324878a;
                if (arrayList.isEmpty()) {
                    return false;
                }
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (kotlin.text.d0.J(str, (String) it8.next(), false)) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = (String) obj2;
                String strE = str2 != null ? jli.g.e(str2) : null;
                if (strE == null) {
                    strE = "";
                }
                return this.f16640b.a(strE);
            default:
                String str3 = (String) obj2;
                if (str3 == null) {
                    str3 = "";
                }
                return this.f16640b.a(str3);
        }
    }
}
