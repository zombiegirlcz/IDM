package androidx.navigationevent;

import a0.d;
import androidx.navigationevent.NavigationEventTransitionState;
import androidx.view.l;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0018\u0010\u0011J%\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J'\u0010$\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010+R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002010,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u0010\u0003R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010G¨\u0006J"}, d2 = {"Landroidx/navigationevent/NavigationEventProcessor;", "", "<init>", "()V", "", "direction", "Landroidx/navigationevent/NavigationEventHandler;", "resolveEnabledHandler", "(I)Landroidx/navigationevent/NavigationEventHandler;", "", "Landroidx/navigationevent/NavigationEventInfo;", "resolveCombinedBackInfo", "()Ljava/util/List;", "", "refreshEnabledHandlers", "handler", "updateEnabledHandlerInfo$navigationevent", "(Landroidx/navigationevent/NavigationEventHandler;)V", "updateEnabledHandlerInfo", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "priority", "addHandler", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventHandler;I)V", "removeHandler", "Landroidx/navigationevent/NavigationEventInput;", "input", "addInput", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventInput;I)V", "Landroidx/navigationevent/NavigationEvent;", "event", "dispatchOnStarted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/NavigationEvent;)V", "dispatchOnProgressed", "Landroidx/navigationevent/OnBackCompletedFallback;", "onBackCompletedFallback", "dispatchOnCompleted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/OnBackCompletedFallback;)V", "dispatchOnCancelled", "(Landroidx/navigationevent/NavigationEventInput;I)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/navigationevent/NavigationEventTransitionState;", "_transitionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "transitionState", "Lkotlinx/coroutines/flow/StateFlow;", "getTransitionState", "()Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/navigationevent/NavigationEventHistory;", "_history", "history", "getHistory", "Lkotlin/collections/ArrayDeque;", "overlayHandlers", "Lkotlin/collections/ArrayDeque;", "defaultHandlers", "inProgressHandler", "Landroidx/navigationevent/NavigationEventHandler;", "inProgressDirection", "I", "getInProgressDirection$annotations", "inProgressInput", "Landroidx/navigationevent/NavigationEventInput;", "", "unspecifiedInputs", "Ljava/util/Set;", "defaultInputs", "overlayInputs", "", "hasEnabledDefaultHandlers", "Z", "hasEnabledOverlayHandlers", "hasEnabledAnyHandlers", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventProcessor {

    @NotNull
    private final MutableStateFlow _history;

    @NotNull
    private final MutableStateFlow _transitionState;

    @NotNull
    private final ArrayDeque<NavigationEventHandler<?>> defaultHandlers;

    @NotNull
    private final Set<NavigationEventInput> defaultInputs;
    private boolean hasEnabledAnyHandlers;
    private boolean hasEnabledDefaultHandlers;
    private boolean hasEnabledOverlayHandlers;

    @NotNull
    private final StateFlow history;
    private int inProgressDirection;
    private NavigationEventHandler<?> inProgressHandler;
    private NavigationEventInput inProgressInput;

    @NotNull
    private final ArrayDeque<NavigationEventHandler<?>> overlayHandlers;

    @NotNull
    private final Set<NavigationEventInput> overlayInputs;

    @NotNull
    private final StateFlow transitionState;

    @NotNull
    private final Set<NavigationEventInput> unspecifiedInputs;

    public NavigationEventProcessor() {
        j2 j2VarC = q.c(NavigationEventTransitionState.Idle.INSTANCE);
        this._transitionState = j2VarC;
        this.transitionState = q.h(j2VarC);
        j2 j2VarC2 = q.c(new NavigationEventHistory());
        this._history = j2VarC2;
        this.history = q.h(j2VarC2);
        this.overlayHandlers = new ArrayDeque<>();
        this.defaultHandlers = new ArrayDeque<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    private final List<NavigationEventInfo> resolveCombinedBackInfo() {
        ArrayList arrayList = new ArrayList();
        for (NavigationEventHandler<?> navigationEventHandler : this.overlayHandlers) {
            if (navigationEventHandler.isBackEnabled() && !navigationEventHandler.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler.getBackInfo());
            }
        }
        for (NavigationEventHandler<?> navigationEventHandler2 : this.defaultHandlers) {
            if (navigationEventHandler2.isBackEnabled() && !navigationEventHandler2.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler2.getBackInfo());
            }
        }
        return arrayList;
    }

    private final NavigationEventHandler<?> resolveEnabledHandler(int direction) {
        NavigationEventHandler<?> next;
        NavigationEventHandler<?> next2;
        NavigationEventHandler<?> next3;
        NavigationEventHandler<?> navigationEventHandler = null;
        if (direction == -1) {
            Iterator<NavigationEventHandler<?>> it8 = this.overlayHandlers.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (next.isBackEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler2 = next;
            if (navigationEventHandler2 != null) {
                return navigationEventHandler2;
            }
            Iterator<NavigationEventHandler<?>> it9 = this.defaultHandlers.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                NavigationEventHandler<?> next4 = it9.next();
                if (next4.isBackEnabled()) {
                    navigationEventHandler = next4;
                    break;
                }
            }
            return navigationEventHandler;
        }
        if (direction == 0) {
            Iterator<NavigationEventHandler<?>> it10 = this.overlayHandlers.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it10.next();
                NavigationEventHandler<?> navigationEventHandler3 = next2;
                if (navigationEventHandler3.isBackEnabled() || navigationEventHandler3.isForwardEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler4 = next2;
            if (navigationEventHandler4 != null) {
                return navigationEventHandler4;
            }
            for (NavigationEventHandler<?> navigationEventHandler5 : this.defaultHandlers) {
                NavigationEventHandler<?> navigationEventHandler6 = navigationEventHandler5;
                if (navigationEventHandler6.isBackEnabled() || navigationEventHandler6.isForwardEnabled()) {
                    navigationEventHandler = navigationEventHandler5;
                    break;
                }
            }
            return navigationEventHandler;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<NavigationEventHandler<?>> it11 = this.overlayHandlers.iterator();
        while (true) {
            if (!it11.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it11.next();
            if (next3.isForwardEnabled()) {
                break;
            }
        }
        NavigationEventHandler<?> navigationEventHandler7 = next3;
        if (navigationEventHandler7 != null) {
            return navigationEventHandler7;
        }
        Iterator<NavigationEventHandler<?>> it12 = this.defaultHandlers.iterator();
        while (true) {
            if (!it12.hasNext()) {
                break;
            }
            NavigationEventHandler<?> next5 = it12.next();
            if (next5.isForwardEnabled()) {
                navigationEventHandler = next5;
                break;
            }
        }
        return navigationEventHandler;
    }

    public static /* synthetic */ NavigationEventHandler resolveEnabledHandler$default(NavigationEventProcessor navigationEventProcessor, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return navigationEventProcessor.resolveEnabledHandler(i);
    }

    public final void addHandler(@NotNull NavigationEventDispatcher dispatcher, @NotNull NavigationEventHandler<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler.getDispatcher() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (priority == 0) {
            this.overlayHandlers.addFirst(handler);
        } else {
            if (priority != 1) {
                throw new IllegalArgumentException(d.n("Unsupported priority value: ", priority));
            }
            this.defaultHandlers.addFirst(handler);
        }
        handler.setDispatcher$navigationevent(dispatcher);
        refreshEnabledHandlers();
    }

    public final void addInput(@NotNull NavigationEventDispatcher dispatcher, @NotNull NavigationEventInput input, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getDispatcher() == null) {
            (priority != 0 ? priority != 1 ? this.unspecifiedInputs : this.defaultInputs : this.overlayInputs).add(input);
            input.setDispatcher$navigationevent(dispatcher);
            input.doOnAdded$navigationevent(dispatcher);
            input.doOnHistoryChanged$navigationevent((NavigationEventHistory) this.history.getValue());
            input.doOnHasEnabledHandlersChanged$navigationevent(priority != 0 ? priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers : this.hasEnabledOverlayHandlers);
            return;
        }
        throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.getDispatcher() + CoreConstants.DOT).toString());
    }

    public final void dispatchOnCancelled(@NotNull NavigationEventInput input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.f(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardCancelled$navigationevent();
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCancelled$navigationevent();
            }
            this._transitionState.setValue(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnCompleted(@NotNull NavigationEventInput input, int direction, OnBackCompletedFallback onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.f(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardCompleted$navigationevent();
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCompleted$navigationevent();
            } else if (onBackCompletedFallback != null) {
                ((l) onBackCompletedFallback).a();
            }
            this._transitionState.setValue(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnProgressed(@NotNull NavigationEventInput input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(direction);
            }
            if (direction != -1) {
                if (direction == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardProgressed$navigationevent(event);
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackProgressed$navigationevent(event);
            }
            this._transitionState.setValue(new NavigationEventTransitionState.InProgress(event, direction));
        }
    }

    public final void dispatchOnStarted(@NotNull NavigationEventInput input, int direction, NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(direction);
        this.inProgressHandler = navigationEventHandlerResolveEnabledHandler;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardStarted$navigationevent(event);
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackStarted$navigationevent(event);
            }
            this._transitionState.setValue(new NavigationEventTransitionState.InProgress(event, direction));
        }
    }

    public final void refreshEnabledHandlers() {
        boolean z;
        boolean z3;
        ArrayDeque<NavigationEventHandler<?>> arrayDeque = this.overlayHandlers;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            for (NavigationEventHandler<?> navigationEventHandler : arrayDeque) {
                if (navigationEventHandler.isBackEnabled() || navigationEventHandler.isForwardEnabled()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ArrayDeque<NavigationEventHandler<?>> arrayDeque2 = this.defaultHandlers;
        if (arrayDeque2 == null || !arrayDeque2.isEmpty()) {
            for (NavigationEventHandler<?> navigationEventHandler2 : arrayDeque2) {
                if (navigationEventHandler2.isBackEnabled() || navigationEventHandler2.isForwardEnabled()) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        boolean z4 = z || z3;
        boolean z6 = this.hasEnabledOverlayHandlers != z;
        boolean z11 = this.hasEnabledDefaultHandlers != z3;
        boolean z12 = this.hasEnabledAnyHandlers != z4;
        if (z6) {
            Iterator<NavigationEventInput> it8 = this.overlayInputs.iterator();
            while (it8.hasNext()) {
                it8.next().doOnHasEnabledHandlersChanged$navigationevent(z);
            }
        }
        if (z11) {
            Iterator<NavigationEventInput> it9 = this.defaultInputs.iterator();
            while (it9.hasNext()) {
                it9.next().doOnHasEnabledHandlersChanged$navigationevent(z3);
            }
        }
        if (z12) {
            Iterator<NavigationEventInput> it10 = this.unspecifiedInputs.iterator();
            while (it10.hasNext()) {
                it10.next().doOnHasEnabledHandlersChanged$navigationevent(z4);
            }
        }
        this.hasEnabledOverlayHandlers = z;
        this.hasEnabledDefaultHandlers = z3;
        this.hasEnabledAnyHandlers = z4;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        updateEnabledHandlerInfo$navigationevent(navigationEventHandlerResolveEnabledHandler$default);
    }

    public final void removeHandler(@NotNull NavigationEventHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (Intrinsics.f(handler, this.inProgressHandler)) {
            int i = this.inProgressDirection;
            if (i == -1) {
                handler.doOnBackCancelled$navigationevent();
            } else if (i == 1) {
                handler.doOnForwardCancelled$navigationevent();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.setDispatcher$navigationevent(null);
        refreshEnabledHandlers();
    }

    public final void updateEnabledHandlerInfo$navigationevent(NavigationEventHandler<?> handler) {
        NavigationEventHistory navigationEventHistory;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        if (Intrinsics.f(navigationEventHandlerResolveEnabledHandler$default, handler)) {
            if (navigationEventHandlerResolveEnabledHandler$default == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(navigationEventHandlerResolveEnabledHandler$default.getCurrentInfo(), resolveCombinedBackInfo(), navigationEventHandlerResolveEnabledHandler$default.getForwardInfo());
            }
            if (Intrinsics.f((NavigationEventHistory) this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<NavigationEventInput> it8 = this.overlayInputs.iterator();
            while (it8.hasNext()) {
                it8.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it9 = this.defaultInputs.iterator();
            while (it9.hasNext()) {
                it9.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it10 = this.unspecifiedInputs.iterator();
            while (it10.hasNext()) {
                it10.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
        }
    }
}
