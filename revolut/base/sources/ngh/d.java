package ngh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f215165a;

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f215165a, ((d) obj2).f215165a);
    }

    public final int hashCode() {
        Data data = this.f215165a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public d(Data data) {
        this.f215165a = data;
    }
}
