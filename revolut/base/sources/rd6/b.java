package rd6;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f253350c;

    public b(String name, String type, ArrayList steps) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f253348a = name;
        this.f253349b = type;
        this.f253350c = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        if (!Intrinsics.f(this.f253348a, bVar.f253348a)) {
            return false;
        }
        String str = bVar.f253349b;
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        return Intrinsics.f(this.f253349b, str) && this.f253350c.equals(bVar.f253350c);
    }

    public final int hashCode() {
        int iHashCode = this.f253348a.hashCode() * 31;
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        return this.f253350c.hashCode() + p.a.c(iHashCode, 31, this.f253349b);
    }
}
