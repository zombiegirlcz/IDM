package dsh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f117318c;
    public final String d;
    public final Function1 e;

    public b(String id10, TextLocalisedClause title, List options, String str, Function1 configUpdateAction) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(configUpdateAction, "configUpdateAction");
        this.f117316a = id10;
        this.f117317b = title;
        this.f117318c = options;
        this.d = str;
        this.e = configUpdateAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117316a, bVar.f117316a) && this.f117317b.equals(bVar.f117317b) && Intrinsics.f(this.f117318c, bVar.f117318c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(this.f117316a.hashCode() * 31, 31, this.f117317b), 31, this.f117318c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
