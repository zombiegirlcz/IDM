package z00;

import gim.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nkm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends h implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f318160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f318161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f318162y;
    public final /* synthetic */ Character[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, int i, ArrayList arrayList, Character[] chArr, Continuation continuation) {
        super(2, continuation);
        this.f318160w = str;
        this.f318161x = i;
        this.f318162y = arrayList;
        this.z = chArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (b(r7, r8, r9, r10, r11, r12, r0 + 1, r14) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(nkm.o r7, int r8, int r9, java.util.List r10, java.lang.Character[] r11, java.lang.StringBuilder r12, int r13, gim.a r14) {
        /*
            boolean r0 = r14 instanceof z00.e
            if (r0 == 0) goto L14
            r0 = r14
            z00.e r0 = (z00.e) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.C = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            z00.e r0 = new z00.e
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.B
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r14.C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.util.List r7 = r14.v
            java.util.List r7 = (java.util.List) r7
            yhm.o.b(r0)
            goto Lb7
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            int r13 = r14.A
            int r9 = r14.z
            int r8 = r14.f318159y
            java.lang.StringBuilder r12 = r14.f318158x
            java.lang.Character[] r11 = r14.f318157w
            java.util.List r7 = r14.v
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            nkm.o r7 = r14.u
            yhm.o.b(r0)
            goto L9c
        L4e:
            yhm.o.b(r0)
            if (r13 == r8) goto Lba
            if (r13 <= r9) goto L56
            goto Lba
        L56:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r2 = 0
        L5e:
            if (r2 >= r0) goto L79
            int r5 = r13 >> r2
            r5 = r5 & r4
            java.lang.Object r6 = r10.get(r2)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r11[r5]
            char r5 = r5.charValue()
            r12.setCharAt(r6, r5)
            int r2 = r2 + 1
            goto L5e
        L79:
            java.lang.String r0 = r12.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r14.u = r7
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            r14.v = r2
            r14.f318157w = r11
            r14.f318158x = r12
            r14.f318159y = r8
            r14.z = r9
            r14.A = r13
            r14.C = r4
            fim.a r0 = r7.b(r0, r14)
            if (r0 != r1) goto L9c
            goto Lb6
        L9c:
            r0 = r13
            int r13 = r0 + 1
            r2 = 0
            r14.u = r2
            r14.v = r2
            r14.f318157w = r2
            r14.f318158x = r2
            r14.f318159y = r8
            r14.z = r9
            r14.A = r0
            r14.C = r3
            java.lang.Object r7 = b(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r7 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        Lba:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z00.f.b(nkm.o, int, int, java.util.List, java.lang.Character[], java.lang.StringBuilder, int, gim.a):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f318160w, this.f318161x, this.f318162y, this.z, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar = (o) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            StringBuilder sb6 = new StringBuilder(this.f318160w);
            this.v = null;
            this.u = 1;
            if (b(oVar, this.f318161x, 8, this.f318162y, this.z, sb6, 0, this) == aVar) {
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
