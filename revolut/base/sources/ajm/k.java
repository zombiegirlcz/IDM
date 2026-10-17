package ajm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends z {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.e = i;
    }

    @Override // ajm.i
    public final Object call(Object[] args) {
        switch (this.e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                Constructor constructor = (Constructor) this.f5624a;
                s0 s0Var = new s0(2);
                s0Var.b(args);
                s0Var.a(null);
                ArrayList arrayList = s0Var.f186433a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                return ((Constructor) this.f5624a).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
