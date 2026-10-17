package fu3;

import dx4.a1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f138083c;
    public final String d;

    public c(String title, String description, List items, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138081a = title;
        this.f138082b = description;
        this.f138083c = items;
        this.d = str;
    }

    public final a a() {
        for (b bVar : this.f138083c) {
            if (bVar.f138080h) {
                return bVar.f138077b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final c b(b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<b> list = this.f138083c;
        ArrayList items = new ArrayList(w.t(list, 10));
        for (b bVar : list) {
            boolean zF = Intrinsics.f(bVar.f138076a, item.f138076a);
            String id10 = bVar.f138076a;
            a type = bVar.f138077b;
            String title = bVar.f138078c;
            String subtitle = bVar.d;
            String value = bVar.e;
            String secondaryValue = bVar.f;
            a1 a1Var = bVar.f138079g;
            boolean z = bVar.i;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
            items.add(new b(id10, type, title, subtitle, value, secondaryValue, a1Var, zF, z));
        }
        String title2 = this.f138081a;
        Intrinsics.checkNotNullParameter(title2, "title");
        String description = this.f138082b;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        return new c(title2, description, items, this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138081a, cVar.f138081a) && Intrinsics.f(this.f138082b, cVar.f138082b) && Intrinsics.f(this.f138083c, cVar.f138083c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f138081a.hashCode() * 31, 31, this.f138082b), 31, this.f138083c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
