package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 {2\u00020\u0001:\u0001{J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\bJ#\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0004H'¢\u0006\u0004\b#\u0010\bJ!\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b$\u0010\rJ\u000f\u0010%\u001a\u00020\u0004H'¢\u0006\u0004\b%\u0010\bJ=\u0010*\u001a\u00020\u0004\"\u0004\b\u0000\u0010&\"\u0004\b\u0001\u0010\u001d2\u0006\u0010'\u001a\u00028\u00002\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040(H'¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b.\u0010/J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0018\u00100J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u00101J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u00102J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u000203H\u0017¢\u0006\u0004\b\u0018\u00104J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u000205H\u0017¢\u0006\u0004\b\u0018\u00106J\u0019\u00107\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b7\u00100J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208H'¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u0002H'¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH'¢\u0006\u0004\bA\u0010!J#\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000BH'¢\u0006\u0004\bC\u0010DJ#\u0010H\u001a\u00020\u00042\u0012\u0010G\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030F0EH'¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0004H'¢\u0006\u0004\bJ\u0010\bJ\u001b\u0010K\u001a\u00020\u00042\n\u0010'\u001a\u0006\u0012\u0002\b\u00030FH'¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H'¢\u0006\u0004\bM\u0010\bJ\u000f\u0010N\u001a\u00020\u0004H&¢\u0006\u0004\bN\u0010\bJ\u000f\u0010P\u001a\u00020OH'¢\u0006\u0004\bP\u0010QR\u001e\u0010V\u001a\u0006\u0012\u0002\b\u00030R8&X§\u0004¢\u0006\f\u0012\u0004\bU\u0010\b\u001a\u0004\bS\u0010TR\u001a\u0010Z\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\bY\u0010\b\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b\\\u0010\b\u001a\u0004\b[\u0010XR\u001a\u0010`\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b_\u0010\b\u001a\u0004\b^\u0010XR\u001c\u0010d\u001a\u0004\u0018\u0001088&X§\u0004¢\u0006\f\u0012\u0004\bc\u0010\b\u001a\u0004\ba\u0010bR\u001a\u0010h\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bg\u0010\b\u001a\u0004\be\u0010fR\u001e\u0010m\u001a\u000605j\u0002`i8&X§\u0004¢\u0006\f\u0012\u0004\bl\u0010\b\u001a\u0004\bj\u0010kR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001a\u0010z\u001a\u00020v8'X§\u0004¢\u0006\f\u0012\u0004\by\u0010\b\u001a\u0004\bw\u0010x\u0082\u0001\u0001|ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006}À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "(Z)V", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "V", "value", "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }
    }

    <V, T> void apply(V value, @NotNull Function2<? super T, ? super V, Unit> block);

    @NotNull
    CompositionContext buildContext();

    boolean changed(float value);

    boolean changed(int value);

    boolean changed(long value);

    boolean changed(Object value);

    boolean changed(boolean value);

    boolean changedInstance(Object value);

    void collectParameterInformation();

    <T> T consume(@NotNull CompositionLocal<T> key);

    <T> void createNode(@NotNull Function0<? extends T> factory);

    void deactivateToEndGroup(boolean changed);

    void endDefaults();

    void endMovableGroup();

    void endNode();

    void endProvider();

    void endProviders();

    void endReplaceGroup();

    void endReplaceableGroup();

    ScopeUpdateScope endRestartGroup();

    void endReusableGroup();

    @NotNull
    Applier<?> getApplier();

    @NotNull
    CoroutineContext getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    @NotNull
    CompositionData getCompositionData();

    default int getCompoundKeyHash() {
        return Long.hashCode(getCompositeKeyHashCode());
    }

    @NotNull
    CompositionLocalMap getCurrentCompositionLocalMap();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    boolean getSkipping();

    void recordSideEffect(@NotNull Function0<Unit> effect);

    void recordUsed(@NotNull RecomposeScope scope);

    Object rememberedValue();

    boolean shouldExecute(boolean parametersChanged, int flags);

    void skipToGroupEnd();

    void startDefaults();

    void startMovableGroup(int key, Object dataKey);

    void startNode();

    void startProvider(@NotNull ProvidedValue<?> value);

    void startProviders(@NotNull ProvidedValue<?>[] values);

    void startReplaceGroup(int key);

    void startReplaceableGroup(int key);

    @NotNull
    Composer startRestartGroup(int key);

    void startReusableGroup(int key, Object dataKey);

    void startReusableNode();

    void updateRememberedValue(Object value);

    void useNode();
}
