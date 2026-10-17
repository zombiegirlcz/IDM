package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bà\u0080\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/ContentReceiver;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/Function0;", "", "content", "", "provideContent", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/f;", "getKey", "()Lkotlin/coroutines/f;", "key", "Key", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContentReceiver extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull ContentReceiver contentReceiver, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) e.a(contentReceiver, r2, function2);
        }

        public static <E extends CoroutineContext.Element> E get(@NotNull ContentReceiver contentReceiver, @NotNull f fVar) {
            return (E) e.b(contentReceiver, fVar);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull ContentReceiver contentReceiver, @NotNull f fVar) {
            return e.c(contentReceiver, fVar);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull ContentReceiver contentReceiver, @NotNull CoroutineContext coroutineContext) {
            return e.d(contentReceiver, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.ContentReceiver$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/ContentReceiver$Key;", "Lkotlin/coroutines/f;", "Landroidx/glance/appwidget/ContentReceiver;", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements f {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default f getKey() {
        return INSTANCE;
    }

    Object provideContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Continuation<?> continuation);
}
