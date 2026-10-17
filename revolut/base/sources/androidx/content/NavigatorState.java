package androidx.content;

import android.os.Bundle;
import androidx.content.internal.SynchronizedObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J \u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H&J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\rH\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0017J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0017J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\tH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006+"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "backStackLock", "Landroidx/navigation/internal/SynchronizedObject;", "_backStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "_transitionsInProgress", "", "value", "", "isNavigating", "()Z", "setNavigating", "(Z)V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionsInProgress", "getTransitionsInProgress", "push", "", "backStackEntry", "pushWithTransition", "createBackStackEntry", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "pop", "popUpTo", "saveState", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "markTransitionComplete", "entry", "prepareForTransition", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigatorState {

    @NotNull
    private final MutableStateFlow _backStack;

    @NotNull
    private final MutableStateFlow _transitionsInProgress;

    @NotNull
    private final StateFlow backStack;

    @NotNull
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;

    @NotNull
    private final StateFlow transitionsInProgress;

    public NavigatorState() {
        j2 j2VarC = q.c(f0.f322471a);
        this._backStack = j2VarC;
        j2 j2VarC2 = q.c(h0.f322473a);
        this._transitionsInProgress = j2VarC2;
        this.backStack = q.h(j2VarC);
        this.transitionsInProgress = q.h(j2VarC2);
    }

    @NotNull
    public abstract NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, Bundle arguments);

    @NotNull
    public final StateFlow getBackStack() {
        return this.backStack;
    }

    @NotNull
    public final StateFlow getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    /* JADX INFO: renamed from: isNavigating, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(a1.j((Set) mutableStateFlow.getValue(), entry));
    }

    public void onLaunchSingleTop(@NotNull NavBackStackEntry backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            try {
                ArrayList arrayListF1 = d0.f1((Collection) getBackStack().getValue());
                ListIterator listIterator = arrayListF1.listIterator(arrayListF1.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (Intrinsics.f(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListF1.set(iNextIndex, backStackEntry);
                this._backStack.setValue(arrayListF1);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void onLaunchSingleTopWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.f(navBackStackEntry.getId(), backStackEntry.getId())) {
                MutableStateFlow mutableStateFlow = this._transitionsInProgress;
                mutableStateFlow.setValue(a1.m(a1.m((Set) mutableStateFlow.getValue(), navBackStackEntry), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        synchronized (this.backStackLock) {
            try {
                MutableStateFlow mutableStateFlow = this._backStack;
                Iterable iterable = (Iterable) this._backStack.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (Intrinsics.f((NavBackStackEntry) obj2, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj2);
                    }
                }
                mutableStateFlow.setValue(arrayList);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void popWithTransition(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it8 = iterable.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it8.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it9 = iterable2.iterator();
                    while (it9.hasNext()) {
                        if (((NavBackStackEntry) it9.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        MutableStateFlow mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(a1.m((Set) mutableStateFlow.getValue(), popUpTo));
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!Intrinsics.f(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            MutableStateFlow mutableStateFlow2 = this._transitionsInProgress;
            mutableStateFlow2.setValue(a1.m((Set) mutableStateFlow2.getValue(), navBackStackEntry2));
        }
        pop(popUpTo, saveState);
    }

    public void prepareForTransition(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(a1.m((Set) mutableStateFlow.getValue(), entry));
    }

    public void push(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            this._backStack.setValue(d0.F0(backStackEntry, (Collection) this._backStack.getValue()));
            Unit unit = Unit.f186387a;
        }
    }

    public void pushWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it8 = iterable.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it8.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it9 = iterable2.iterator();
                        while (it9.hasNext()) {
                            if (((NavBackStackEntry) it9.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) d0.o0((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            MutableStateFlow mutableStateFlow = this._transitionsInProgress;
            mutableStateFlow.setValue(a1.m((Set) mutableStateFlow.getValue(), navBackStackEntry));
        }
        MutableStateFlow mutableStateFlow2 = this._transitionsInProgress;
        mutableStateFlow2.setValue(a1.m((Set) mutableStateFlow2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    public final void setNavigating(boolean z) {
        this.isNavigating = z;
    }
}
