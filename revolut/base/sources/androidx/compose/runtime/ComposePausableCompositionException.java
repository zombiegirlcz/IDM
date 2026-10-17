package androidx.compose.runtime;

import androidx.collection.IntList;
import androidx.collection.ObjectList;
import gim.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.sequences.Sequence;
import kotlin.text.t;
import nkm.o;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/collection/ObjectList;", "", "instances", "reused", "Landroidx/collection/IntList;", "operations", "", "lastOperation", "", "cause", "<init>", "(Landroidx/collection/ObjectList;Landroidx/collection/ObjectList;Landroidx/collection/IntList;ILjava/lang/Throwable;)V", "Lkotlin/sequences/Sequence;", "", "operationsSequence", "()Lkotlin/sequences/Sequence;", "Landroidx/collection/ObjectList;", "Landroidx/collection/IntList;", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposePausableCompositionException extends RuntimeException {

    @NotNull
    private final ObjectList<Object> instances;
    private final int lastOperation;

    @NotNull
    private final IntList operations;

    @NotNull
    private final ObjectList<Object> reused;

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1, reason: invalid class name */
    @gim.d(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnkm/o;", "", "", "<anonymous>", "(Lnkm/o;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends h implements Function2<o, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ComposePausableCompositionException.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            int i;
            o oVar;
            int i2;
            int i3;
            String strM;
            int i5;
            int i6;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i21 = this.label;
            if (i21 == 0) {
                yhm.o.b(obj2);
                i = 0;
                oVar = (o) this.L$0;
                i2 = 0;
                i3 = 0;
            } else {
                if (i21 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i22 = this.I$2;
                int i32 = this.I$1;
                int i33 = this.I$0;
                oVar = (o) this.L$0;
                yhm.o.b(obj2);
                i2 = i32;
                i3 = i22;
                i = i33;
            }
            while (i < Math.min(ComposePausableCompositionException.this.lastOperation + 10, ComposePausableCompositionException.this.operations._size)) {
                int i43 = i + 1;
                int i59 = ComposePausableCompositionException.this.operations.get(i);
                switch (i59) {
                    case 0:
                        strM = "up";
                        break;
                    case 1:
                        strM = a0.d.m(ComposePausableCompositionException.this.instances.get(i2), "down ");
                        i2++;
                        break;
                    case 2:
                        strM = "remove " + ComposePausableCompositionException.this.operations.get(i43) + p.SPACE_CHAR + ComposePausableCompositionException.this.operations.get(i + 2);
                        i43 = i + 3;
                        break;
                    case 3:
                        strM = "move " + ComposePausableCompositionException.this.operations.get(i43) + p.SPACE_CHAR + ComposePausableCompositionException.this.operations.get(i + 2) + p.SPACE_CHAR + ComposePausableCompositionException.this.operations.get(i + 3);
                        i43 = i + 4;
                        break;
                    case 4:
                        strM = "clear";
                        break;
                    case 5:
                        i5 = i + 2;
                        i6 = i2 + 1;
                        strM = "insertBottomUp " + ComposePausableCompositionException.this.operations.get(i43) + p.SPACE_CHAR + ComposePausableCompositionException.this.instances.get(i2);
                        i43 = i5;
                        i2 = i6;
                        break;
                    case 6:
                        i5 = i + 2;
                        i6 = i2 + 1;
                        strM = "insertTopDown " + ComposePausableCompositionException.this.operations.get(i43) + p.SPACE_CHAR + ComposePausableCompositionException.this.instances.get(i2);
                        i43 = i5;
                        i2 = i6;
                        break;
                    case 7:
                        Object obj3 = ComposePausableCompositionException.this.instances.get(i2);
                        Intrinsics.i(obj3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        u0.f(2, obj3);
                        i2 += 2;
                        strM = "apply " + ((Function2) obj3);
                        break;
                    case 8:
                        strM = "reuse " + ComposePausableCompositionException.this.reused.get(i3);
                        i3++;
                        break;
                    case 9:
                        strM = "recompose pending";
                        break;
                    default:
                        strM = a0.d.n("unknown op: ", i59);
                        break;
                }
                String str = i + ": " + strM;
                this.L$0 = oVar;
                this.I$0 = i43;
                this.I$1 = i2;
                this.I$2 = i3;
                this.label = 1;
                if (oVar.b(str, this) == aVar) {
                    return aVar;
                }
                i = i43;
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o oVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(oVar, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public ComposePausableCompositionException(@NotNull ObjectList<Object> objectList, @NotNull ObjectList<Object> objectList2, @NotNull IntList intList, int i, Throwable th10) {
        super(th10);
        this.instances = objectList;
        this.reused = objectList2;
        this.operations = intList;
        this.lastOperation = i;
    }

    private final Sequence<String> operationsSequence() {
        return nkm.p.b(new AnonymousClass1(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return t.f("\n            |Failed to execute op number " + this.lastOperation + ":\n            |" + d0.k0(d0.W0(50, y.J(operationsSequence())), "\n", null, null, 0, null, 62) + "\n            ");
    }
}
