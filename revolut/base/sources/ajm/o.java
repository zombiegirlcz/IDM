package ajm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }

    @Override // ajm.z
    public void a(Object[] args) {
        switch (this.e) {
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
