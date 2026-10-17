package ajm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Field field, boolean z, boolean z3, int i) {
        super(field, z, z3);
        this.f5618g = i;
    }

    @Override // ajm.t, ajm.z
    public void a(Object[] args) {
        switch (this.f5618g) {
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                super.a(args);
                e(kotlin.collections.d.P(args));
                break;
            default:
                super.a(args);
                break;
        }
    }
}
