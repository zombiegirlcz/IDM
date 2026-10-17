package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import ukm.u;
import vc.s;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0002-.B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002JK\u0010&\u001a\u0002H'\"\b\b\u0000\u0010'*\u00020\u0011\"\b\b\u0001\u0010(*\u00020\u00112\u0006\u0010)\u001a\u0002H(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u00020\u00120\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H'0\bH\u0002¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuProvider;", "view", "Landroid/view/View;", "callbackInjector", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;", "coordinatesProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onDataChange", "", "", "onPositionChange", "actionMode", "Landroid/view/ActionMode;", "startActionModeRunnable", "Ljava/lang/Runnable;", "finishActionModeRunnable", "showTextContextMenu", "dataProvider", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "(Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "dispose", "createActionModeCallback", ib.b.Session, "Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$TextContextMenuSessionImpl;", "observeAndGetData", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "observeAndGetBounds", "Landroidx/compose/ui/geometry/Rect;", "observeReadsAndGet", "T", "S", "scope", "onValueChanged", "block", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "TextActionModeCallbackImpl", "TextContextMenuSessionImpl", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidTextContextMenuToolbarProvider implements TextContextMenuProvider {
    private ActionMode actionMode;
    private final Function1<TextActionModeCallback, TextActionModeCallback> callbackInjector;

    @NotNull
    private final Function0<LayoutCoordinates> coordinatesProvider;
    private Runnable finishActionModeRunnable;
    private Runnable startActionModeRunnable;

    @NotNull
    private final View view;

    @NotNull
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    @NotNull
    private final SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new p1.a(this, 0));

    @NotNull
    private final Function1<Object, Unit> onDataChange = new p1.a(this, 1);

    @NotNull
    private final Function1<Object, Unit> onPositionChange = new p1.a(this, 2);

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$TextActionModeCallbackImpl;", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;", ib.b.Session, "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "dataBuilder", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "positioner", "Landroidx/compose/ui/geometry/Rect;", "view", "Landroid/view/View;", "<init>", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V", "previousData", "onGetContentRect", "mode", "Landroid/view/ActionMode;", "onCreateActionMode", "", "menu", "Landroid/view/Menu;", "onPrepareActionMode", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onDestroyActionMode", "", "updateMenuItems", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextActionModeCallbackImpl implements TextActionModeCallback {

        @NotNull
        private final Function0<TextContextMenuData> dataBuilder;

        @NotNull
        private Function0<Rect> positioner;
        private TextContextMenuData previousData;

        @NotNull
        private final TextContextMenuSession session;

        @NotNull
        private final View view;

        public TextActionModeCallbackImpl(@NotNull TextContextMenuSession textContextMenuSession, @NotNull Function0<TextContextMenuData> function0, @NotNull Function0<Rect> function02, @NotNull View view) {
            this.session = textContextMenuSession;
            this.dataBuilder = function0;
            this.positioner = function02;
            this.view = view;
        }

        private final boolean updateMenuItems(Menu menu) {
            TextContextMenuData textContextMenuData = (TextContextMenuData) this.dataBuilder.invoke();
            if (Intrinsics.f(textContextMenuData, this.previousData)) {
                return false;
            }
            menu.clear();
            List<TextContextMenuComponent> components = textContextMenuData.getComponents();
            int size = components.size();
            int i = 1;
            int i2 = 1;
            for (int i3 = 0; i3 < size; i3++) {
                TextContextMenuComponent textContextMenuComponent = components.get(i3);
                if (textContextMenuComponent instanceof TextContextMenuItem) {
                    int i5 = i + 1;
                    TextContextMenuItem textContextMenuItem = (TextContextMenuItem) textContextMenuComponent;
                    MenuItem menuItemAdd = menu.add(i2, i, i, textContextMenuItem.getLabel());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new a(textContextMenuItem, this, 0));
                    i = i5;
                } else if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                    TextContextMenuTextClassificationItem textContextMenuTextClassificationItem = (TextContextMenuTextClassificationItem) textContextMenuComponent;
                    TextToolbarHelperApi28.INSTANCE.addMenuItem(menu, i, this.view.getContext(), textContextMenuTextClassificationItem.getTextClassification(), textContextMenuTextClassificationItem.getIndex());
                    i++;
                } else if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                    i2++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean updateMenuItems$lambda$0$0(TextContextMenuComponent textContextMenuComponent, TextActionModeCallbackImpl textActionModeCallbackImpl, MenuItem menuItem) {
            ((TextContextMenuItem) textContextMenuComponent).getOnClick().invoke(textActionModeCallbackImpl.session);
            return true;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onActionItemClicked(@NotNull ActionMode mode, @NotNull MenuItem item) {
            return false;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onCreateActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
            updateMenuItems(menu);
            return menu.size() > 0;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public void onDestroyActionMode(@NotNull ActionMode mode) {
            this.session.close();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        @NotNull
        public Rect onGetContentRect(@NotNull ActionMode mode, View view) {
            return (Rect) this.positioner.invoke();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onPrepareActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
            return updateMenuItems(menu);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$TextContextMenuSessionImpl;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "<init>", "()V", "", "close", "awaitClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lukm/u;", "channel", "Lukm/u;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextContextMenuSessionImpl implements TextContextMenuSession {

        @NotNull
        private final u channel = s.a(0, null, null, 7);

        public final Object awaitClose(@NotNull Continuation<? super Unit> continuation) {
            Object objJ = this.channel.j(continuation);
            return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.mo3647trySendJP2dKIU(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2, reason: invalid class name */
    @gim.d(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {181}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends gim.i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ TextContextMenuDataProvider $dataProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextContextMenuDataProvider textContextMenuDataProvider, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$dataProvider = textContextMenuDataProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextActionModeCallback textActionModeCallback, TextContextMenuSessionImpl textContextMenuSessionImpl) {
            ActionMode actionModeStartActionMode = TextToolbarHelper.INSTANCE.startActionMode(androidTextContextMenuToolbarProvider.view, textActionModeCallback);
            Intrinsics.f(androidTextContextMenuToolbarProvider.actionMode, actionModeStartActionMode);
            if (actionModeStartActionMode == null) {
                textContextMenuSessionImpl.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
            ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AndroidTextContextMenuToolbarProvider.this.new AnonymousClass2(this.$dataProvider, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Handler handler;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o.b(obj2);
                    final TextContextMenuSessionImpl textContextMenuSessionImpl = new TextContextMenuSessionImpl();
                    final TextActionModeCallback textActionModeCallbackCreateActionModeCallback = AndroidTextContextMenuToolbarProvider.this.createActionModeCallback(textContextMenuSessionImpl, this.$dataProvider);
                    Looper looperMyLooper = Looper.myLooper();
                    Handler handler2 = AndroidTextContextMenuToolbarProvider.this.view.getHandler();
                    if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable = AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable;
                        if (runnable == null) {
                            final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = AndroidTextContextMenuToolbarProvider.this;
                            Runnable runnable2 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$0(androidTextContextMenuToolbarProvider, textActionModeCallbackCreateActionModeCallback, textContextMenuSessionImpl);
                                }
                            };
                            androidTextContextMenuToolbarProvider.startActionModeRunnable = runnable2;
                            runnable = runnable2;
                        }
                        AndroidTextContextMenuToolbarProvider.this.view.post(runnable);
                    } else {
                        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = AndroidTextContextMenuToolbarProvider.this;
                        ActionMode actionModeStartActionMode = TextToolbarHelper.INSTANCE.startActionMode(androidTextContextMenuToolbarProvider2.view, textActionModeCallbackCreateActionModeCallback);
                        if (actionModeStartActionMode == null) {
                            return Unit.f186387a;
                        }
                        androidTextContextMenuToolbarProvider2.actionMode = actionModeStartActionMode;
                    }
                    this.label = 1;
                    if (textContextMenuSessionImpl.awaitClose(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                    Runnable runnable3 = AndroidTextContextMenuToolbarProvider.this.finishActionModeRunnable;
                    if (runnable3 == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider3 = AndroidTextContextMenuToolbarProvider.this;
                        Runnable runnable4 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$2(androidTextContextMenuToolbarProvider3);
                            }
                        };
                        androidTextContextMenuToolbarProvider3.finishActionModeRunnable = runnable4;
                        runnable3 = runnable4;
                    }
                    AndroidTextContextMenuToolbarProvider.this.view.post(runnable3);
                } else {
                    ActionMode actionMode = AndroidTextContextMenuToolbarProvider.this.actionMode;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                }
                Runnable runnable5 = AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable;
                if (runnable5 != null) {
                    AndroidTextContextMenuToolbarProvider.this.view.removeCallbacks(runnable5);
                }
                AndroidTextContextMenuToolbarProvider.this.actionMode = null;
                return Unit.f186387a;
            } finally {
                AndroidTextContextMenuToolbarProvider.this.snapshotStateObserver.clear();
                Looper looperMyLooper2 = Looper.myLooper();
                handler = AndroidTextContextMenuToolbarProvider.this.view.getHandler();
                if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                    Runnable runnable6 = AndroidTextContextMenuToolbarProvider.this.finishActionModeRunnable;
                    if (runnable6 == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider4 = AndroidTextContextMenuToolbarProvider.this;
                        Runnable runnable7 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$2(androidTextContextMenuToolbarProvider4);
                            }
                        };
                        androidTextContextMenuToolbarProvider4.finishActionModeRunnable = runnable7;
                        runnable6 = runnable7;
                    }
                    AndroidTextContextMenuToolbarProvider.this.view.post(runnable6);
                } else {
                    ActionMode actionMode2 = AndroidTextContextMenuToolbarProvider.this.actionMode;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                }
                Runnable runnable8 = AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable;
                if (runnable8 != null) {
                    AndroidTextContextMenuToolbarProvider.this.view.removeCallbacks(runnable8);
                }
                AndroidTextContextMenuToolbarProvider.this.actionMode = null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidTextContextMenuToolbarProvider(@NotNull View view, Function1<? super TextActionModeCallback, ? extends TextActionModeCallback> function1, @NotNull Function0<? extends LayoutCoordinates> function0) {
        this.view = view;
        this.callbackInjector = function1;
        this.coordinatesProvider = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextActionModeCallback createActionModeCallback(TextContextMenuSessionImpl session, TextContextMenuDataProvider dataProvider) {
        TextActionModeCallback textActionModeCallback;
        TextActionModeCallbackImpl textActionModeCallbackImpl = new TextActionModeCallbackImpl(session, new p1.b(this, dataProvider, 0), new p1.b(this, dataProvider, 1), this.view);
        Function1<TextActionModeCallback, TextActionModeCallback> function1 = this.callbackInjector;
        return (function1 == null || (textActionModeCallback = (TextActionModeCallback) function1.invoke(textActionModeCallbackImpl)) == null) ? textActionModeCallbackImpl : textActionModeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect observeAndGetBounds(TextContextMenuDataProvider dataProvider) {
        return (Rect) observeReadsAndGet("positioner", this.onPositionChange, new p1.b(this, dataProvider, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect observeAndGetBounds$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider) {
        Object objInvoke = androidTextContextMenuToolbarProvider.coordinatesProvider.invoke();
        if (!((LayoutCoordinates) objInvoke).isAttached()) {
            objInvoke = null;
        }
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) objInvoke;
        return layoutCoordinates == null ? Rect.INSTANCE.getZero() : textContextMenuDataProvider.contentBounds(layoutCoordinates).m1852translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextContextMenuData observeAndGetData(TextContextMenuDataProvider dataProvider) {
        return (TextContextMenuData) observeReadsAndGet("dataBuilder", this.onDataChange, new os2.a(dataProvider, 15));
    }

    private final <T, S> T observeReadsAndGet(S scope, Function1<? super S, Unit> onValueChanged, Function0<? extends T> block) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.snapshotStateObserver.observeReads(scope, onValueChanged, new lmb.o(ref$ObjectRef, block, 1));
        T t2 = (T) ref$ObjectRef.f186409a;
        if (t2 != null) {
            return t2;
        }
        Intrinsics.r("result");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeReadsAndGet$lambda$0(Ref$ObjectRef ref$ObjectRef, Function0 function0) {
        ref$ObjectRef.f186409a = function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj2) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositionChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj2) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            TextToolbarHelper.INSTANCE.invalidateContentRect(actionMode);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit snapshotStateObserver$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Function0 function0) {
        Handler handler = androidTextContextMenuToolbarProvider.view.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function0.invoke();
        } else {
            Handler handler2 = androidTextContextMenuToolbarProvider.view.getHandler();
            if (handler2 != null) {
                handler2.post(new a3l.c(11, function0));
            }
        }
        return Unit.f186387a;
    }

    public final void dispose() {
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(@NotNull TextContextMenuDataProvider textContextMenuDataProvider, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(textContextMenuDataProvider, null), continuation, 1, null);
        return objMutate$default == fim.a.COROUTINE_SUSPENDED ? objMutate$default : Unit.f186387a;
    }

    public final void start() {
        this.snapshotStateObserver.start();
    }
}
