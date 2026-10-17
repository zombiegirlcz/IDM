package ajm;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class d0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f5603a = new d0();

    @Override // ajm.i
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // ajm.i
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // ajm.i
    public final List d() {
        return zhm.f0.f322471a;
    }

    @Override // ajm.i
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
