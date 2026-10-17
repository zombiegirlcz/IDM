package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.fourthline.orca.internal.p70;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g81 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h7.b f28805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28806c;
        final /* synthetic */ float d;
        final /* synthetic */ h7.u e;
        final /* synthetic */ h7.q f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h7.r f28807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h7.v f28808h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h7.b bVar, int i, float f, h7.u uVar, h7.q qVar, h7.r rVar, h7.v vVar, Continuation continuation) {
            super(2, continuation);
            this.f28805b = bVar;
            this.f28806c = i;
            this.d = f;
            this.e = uVar;
            this.f = qVar;
            this.f28807g = rVar;
            this.f28808h = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f28805b, this.f28806c, this.d, this.e, this.f, this.f28807g, this.f28808h, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f28804a;
            if (i == 0) {
                yhm.o.b(obj2);
                h7.b bVar = this.f28805b;
                d7.j jVarA = g81.a(this.f28808h);
                int i2 = this.f28806c;
                float f = this.d;
                h7.u uVar = this.e;
                float f4 = ((h7.j) this.f).f();
                h7.r rVar = this.f28807g;
                this.f28804a = 1;
                if (a1m.e.e(bVar, jVarA, i2, f, uVar, f4, rVar, this, 1674) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, boolean z, boolean z3, long j2, long j3, long j5, long j16, int i, float f, h7.u uVar, p70 p70Var, h7.r rVar, Function1 function1, ContentScale contentScale, int i2, int i3, int i5, Composer composer, int i6) {
        a(modifier, z, z3, j2, j3, j5, j16, i, f, uVar, p70Var, rVar, function1, contentScale, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i5);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f) {
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128 A[PHI: r29
      0x0128: PHI (r29v25 int) = (r29v0 int), (r29v5 int), (r29v6 int) binds: [B:96:0x0126, B:106:0x0141, B:105:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r56, boolean r57, boolean r58, long r59, long r61, long r63, long r65, int r67, float r68, h7.u r69, final com.fourthline.orca.internal.p70 r70, h7.r r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.layout.ContentScale r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instruction units count: 2256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g81.a(androidx.compose.ui.Modifier, boolean, boolean, long, long, long, long, int, float, h7.u, com.fourthline.orca.internal.p70, h7.r, kotlin.jvm.functions.Function1, androidx.compose.ui.layout.ContentScale, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a(h7.b bVar) {
        return ((h7.j) bVar).f();
    }

    public static final p70 a(p70 p70Var, Pair range) {
        Intrinsics.checkNotNullParameter(p70Var, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (p70Var instanceof p70.b) {
            return new p70.b(((p70.b) p70Var).b(), range);
        }
        if (p70Var instanceof p70.a) {
            return new p70.a(((p70.a) p70Var).b(), range);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final d7.j a(h7.v vVar) {
        return (d7.j) ((h7.x) vVar).f149828b.getValue();
    }
}
