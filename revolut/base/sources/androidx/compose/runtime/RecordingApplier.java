package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 1*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J5\u0010\u001d\u001a\u00020\u00072\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\nJ#\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\nR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0005¨\u00062"}, d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "down", "up", "()V", "", "index", "count", "remove", "(II)V", "from", "to", "move", "(III)V", "clear", "instance", "insertBottomUp", "(ILjava/lang/Object;)V", "insertTopDown", "Lkotlin/Function2;", "", "block", "value", "apply", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "applier", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "playTo", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/internal/RememberEventDispatcher;)V", "markRecomposePending", "Landroidx/collection/MutableIntList;", "operations", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableObjectList;", "instances", "Landroidx/collection/MutableObjectList;", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordingApplier<N> implements Applier<N> {
    private N current;
    public static final int $stable = 8;

    @NotNull
    private final MutableIntList operations = new MutableIntList(0, 1, null);

    @NotNull
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public RecordingApplier(N n3) {
        this.current = n3;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(@NotNull Function2<? super N, Object, Unit> block, Object value) {
        this.operations.add(7);
        this.instances.add(block);
        this.instances.add(value);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N node) {
        this.operations.add(1);
        this.instances.add(node);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N instance) {
        this.operations.add(5);
        this.operations.add(index);
        this.instances.add(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N instance) {
        this.operations.add(6);
        this.operations.add(index);
        this.instances.add(instance);
    }

    public final void markRecomposePending() {
        this.operations.add(9);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to6, int count) {
        this.operations.add(3);
        this.operations.add(from);
        this.operations.add(to6);
        this.operations.add(count);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(@NotNull Applier<N> applier, @NotNull RememberEventDispatcher rememberManager) {
        Exception exc2;
        Exception exc3;
        int i;
        int i2;
        MutableIntList mutableIntList = this.operations;
        int i3 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        int i5 = 0;
        MutableObjectList mutableObjectList2 = new MutableObjectList(0, 1, null);
        applier.onBeginChanges();
        int i6 = 0;
        while (i5 < i3) {
            int i21 = i5 + 1;
            try {
                try {
                    switch (mutableIntList.get(i5)) {
                        case 0:
                            applier.up();
                            i5 = i21;
                            break;
                        case 1:
                            int i22 = i6 + 1;
                            applier.down(mutableObjectList.get(i6));
                            i6 = i22;
                            i5 = i21;
                            break;
                        case 2:
                            int i32 = i5 + 2;
                            i5 += 3;
                            applier.remove(mutableIntList.get(i21), mutableIntList.get(i32));
                            break;
                        case 3:
                            int i33 = i5 + 2;
                            try {
                                i = i5 + 3;
                            } catch (Exception e) {
                                exc2 = e;
                                i21 = i33;
                            }
                            try {
                                i5 += 4;
                                applier.move(mutableIntList.get(i21), mutableIntList.get(i33), mutableIntList.get(i));
                            } catch (Exception e2) {
                                exc2 = e2;
                                i21 = i;
                                throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i21 - 1, exc2);
                            }
                            break;
                        case 4:
                            applier.clear();
                            i5 = i21;
                            break;
                        case 5:
                            i5 += 2;
                            i2 = i6 + 1;
                            applier.insertBottomUp(mutableIntList.get(i21), mutableObjectList.get(i6));
                            i6 = i2;
                            break;
                        case 6:
                            i5 += 2;
                            try {
                                i2 = i6 + 1;
                                applier.insertTopDown(mutableIntList.get(i21), mutableObjectList.get(i6));
                                i6 = i2;
                            } catch (Exception e4) {
                                exc3 = e4;
                                i21 = i5;
                                exc2 = exc3;
                                throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i21 - 1, exc2);
                            }
                            break;
                        case 7:
                            int i43 = i6 + 1;
                            Object obj2 = mutableObjectList.get(i6);
                            Intrinsics.i(obj2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            u0.f(2, obj2);
                            i6 += 2;
                            applier.apply((Function2) obj2, mutableObjectList.get(i43));
                            i5 = i21;
                            break;
                        case 8:
                            Object current = applier.getCurrent();
                            if (current instanceof ComposeNodeLifecycleCallback) {
                                rememberManager.dispatchOnDeactivateIfNecessary((ComposeNodeLifecycleCallback) current);
                            }
                            mutableObjectList2.add(current);
                            applier.reuse();
                            i5 = i21;
                            break;
                        default:
                            i5 = i21;
                            break;
                    }
                } catch (Throwable th10) {
                    applier.onEndChanges();
                    throw th10;
                }
            } catch (Exception e5) {
                exc3 = e5;
                exc2 = exc3;
                throw new ComposePausableCompositionException(mutableObjectList, mutableObjectList2, mutableIntList, i21 - 1, exc2);
            }
        }
        if (i6 != mutableObjectList.get_size()) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        mutableObjectList.clear();
        mutableIntList.clear();
        applier.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        this.operations.add(2);
        this.operations.add(index);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.add(0);
    }
}
