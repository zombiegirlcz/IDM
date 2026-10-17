package bu4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18671b;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data content, String str, int i) {
        if ((i & 1) != 0) {
            content = aVar.f18670a;
        }
        if ((i & 2) != 0) {
            str = aVar.f18671b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new a(content, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18670a, aVar.f18670a) && Intrinsics.f(this.f18671b, aVar.f18671b);
    }

    public final int hashCode() {
        int iHashCode = this.f18670a.hashCode() * 31;
        String str = this.f18671b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public a(Data content, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f18670a = content;
        this.f18671b = str;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
