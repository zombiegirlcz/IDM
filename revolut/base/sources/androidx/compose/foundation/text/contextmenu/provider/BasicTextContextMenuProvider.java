package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import fim.a;
import gim.d;
import gim.i;
import ib.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import oim.o;
import org.jetbrains.annotations.NotNull;
import ukm.u;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001 B-\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R2\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R7\u0010\u001f\u001a\b\u0018\u00010\u0017R\u00020\u00002\f\u0010\u0018\u001a\b\u0018\u00010\u0017R\u00020\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuProvider;", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "contextMenuBlock", "<init>", "(Loim/o;)V", "dataProvider", "showTextContextMenu", "(Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchorLayoutCoordinates", "ContextMenu", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "cancel", "()V", "Loim/o;", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "<set-?>", "session$delegate", "Landroidx/compose/runtime/MutableState;", "getSession", "()Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "setSession", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;)V", b.Session, "SessionImpl", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BasicTextContextMenuProvider implements TextContextMenuProvider {

    @NotNull
    private final o contextMenuBlock;

    @NotNull
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* JADX INFO: renamed from: session$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState session = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "dataProvider", "<init>", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;)V", "", "close", "()V", "awaitClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "getDataProvider", "()Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "Lukm/u;", "channel", "Lukm/u;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SessionImpl implements TextContextMenuSession {

        @NotNull
        private final u channel = s.a(0, null, null, 7);

        @NotNull
        private final TextContextMenuDataProvider dataProvider;

        public SessionImpl(@NotNull TextContextMenuDataProvider textContextMenuDataProvider) {
            this.dataProvider = textContextMenuDataProvider;
        }

        public final Object awaitClose(@NotNull Continuation<? super Unit> continuation) {
            Object objJ = this.channel.j(continuation);
            return objJ == a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.mo3647trySendJP2dKIU(Unit.f186387a);
        }

        @NotNull
        public final TextContextMenuDataProvider getDataProvider() {
            return this.dataProvider;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2, reason: invalid class name */
    @d(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionImpl $localSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionImpl sessionImpl, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$localSession = sessionImpl;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return BasicTextContextMenuProvider.this.new AnonymousClass2(this.$localSession, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    BasicTextContextMenuProvider.this.setSession(this.$localSession);
                    SessionImpl sessionImpl = this.$localSession;
                    this.label = 1;
                    if (sessionImpl.awaitClose(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                BasicTextContextMenuProvider.this.setSession(null);
                return Unit.f186387a;
            } catch (Throwable th10) {
                BasicTextContextMenuProvider.this.setSession(null);
                throw th10;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public BasicTextContextMenuProvider(@NotNull o oVar) {
        this.contextMenuBlock = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContextMenu$lambda$0(BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0, int i, Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContextMenu$lambda$1(BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0, int i, Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SessionImpl getSession() {
        return (SessionImpl) this.session.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSession(SessionImpl sessionImpl) {
        this.session.setValue(sessionImpl);
    }

    public final void ContextMenu(@NotNull final Function0<? extends LayoutCoordinates> function0, Composer composer, final int i) {
        int i2;
        final Function0<? extends LayoutCoordinates> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(723898654);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723898654, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            SessionImpl session = getSession();
            if (session == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this) { // from class: r1.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BasicTextContextMenuProvider f250809b;

                        {
                            this.f250809b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i3;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i5) {
                                case 0:
                                    return BasicTextContextMenuProvider.ContextMenu$lambda$0(this.f250809b, function0, i, composer2, iIntValue);
                                default:
                                    return BasicTextContextMenuProvider.ContextMenu$lambda$1(this.f250809b, function0, i, composer2, iIntValue);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            this.contextMenuBlock.invoke(session, session.getDataProvider(), function02, composerStartRestartGroup, Integer.valueOf((i2 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function02 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(this) { // from class: r1.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasicTextContextMenuProvider f250809b;

                {
                    this.f250809b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i59 = i5;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i59) {
                        case 0:
                            return BasicTextContextMenuProvider.ContextMenu$lambda$0(this.f250809b, function02, i, composer2, iIntValue);
                        default:
                            return BasicTextContextMenuProvider.ContextMenu$lambda$1(this.f250809b, function02, i, composer2, iIntValue);
                    }
                }
            });
        }
    }

    public final void cancel() {
        SessionImpl session = getSession();
        if (session != null) {
            session.close();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(@NotNull TextContextMenuDataProvider textContextMenuDataProvider, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(new SessionImpl(textContextMenuDataProvider), null), continuation, 1, null);
        return objMutate$default == a.COROUTINE_SUSPENDED ? objMutate$default : Unit.f186387a;
    }
}
