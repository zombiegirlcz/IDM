package com.onfido.android.sdk.capture.internal.navigation.navigator;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import com.onfido.android.sdk.capture.internal.navigation.Back;
import com.onfido.android.sdk.capture.internal.navigation.BackTo;
import com.onfido.android.sdk.capture.internal.navigation.Forward;
import com.onfido.android.sdk.capture.internal.navigation.NavigationCommand;
import com.onfido.android.sdk.capture.internal.navigation.NavigationManager;
import com.onfido.android.sdk.capture.internal.navigation.Replace;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import ib.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\rH\u0017J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\u0016\u0010*\u001a\u00020+*\u00020+2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002J3\u0010,\u001a\b\u0012\u0004\u0012\u0002H-0\r\"\u0004\b\u0000\u0010-*\b\u0012\u0004\u0012\u0002H-0\r2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u00170/H\u0082\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "Lcom/onfido/android/sdk/capture/internal/navigation/NavigationManager;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/fragment/app/FragmentManager;I)V", "backStackScreenKeysCopy", "", "", "currentScreensSnapshot", "", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "getCurrentScreensSnapshot", "()Ljava/util/List;", "screenMap", "", "commitNewFragment", "", b.Screen, "addToBackStack", "", "isBackNavigation", "executeCommands", "navigationCommands", "Lcom/onfido/android/sdk/capture/internal/navigation/NavigationCommand;", "performBack", "performBackTo", "command", "Lcom/onfido/android/sdk/capture/internal/navigation/BackTo;", "performForward", "Lcom/onfido/android/sdk/capture/internal/navigation/Forward;", "performReplace", "Lcom/onfido/android/sdk/capture/internal/navigation/Replace;", "popToRoot", "restoreFromBundle", "bundle", "Landroid/os/Bundle;", "saveState", "syncWithFragmentManagerBackstack", "applyCustomAnimations", "Landroidx/fragment/app/FragmentTransaction;", "takeWhileInclusive", "T", "predicate", "Lkotlin/Function1;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FragmentNavigationManager implements NavigationManager {

    @NotNull
    private final List<String> backStackScreenKeysCopy;
    private final int containerId;

    @NotNull
    private final FragmentManager fragmentManager;

    @NotNull
    private final Map<String, Screen> screenMap;

    @NotNull
    private static final String KEY_SCREEN_MAP_VALUES = "screenMapValues";

    @NotNull
    private static final String KEY_SCREEN_MAP_KEYS = "screenMapKeys";

    @NotNull
    private static final String KEY_STATE_NAVIGATOR = "fragment_navigator_key_state_navigator";

    @NotNull
    private static final String KEY_SCREEN_KEYS_COPY = "backStackScreenKeys";

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 implements SavedStateRegistry.SavedStateProvider, n {
        public AnonymousClass1() {
        }

        public final boolean equals(Object obj2) {
            if ((obj2 instanceof SavedStateRegistry.SavedStateProvider) && (obj2 instanceof n)) {
                return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.n
        @NotNull
        public final Function getFunctionDelegate() {
            return new q(0, 0, FragmentNavigationManager.class, FragmentNavigationManager.this, "saveState", "saveState()Landroid/os/Bundle;");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @NotNull
        public final Bundle saveState() {
            return FragmentNavigationManager.this.saveState();
        }
    }

    public FragmentNavigationManager(@NotNull SavedStateRegistryOwner savedStateRegistryOwner, @NotNull FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.containerId = i;
        this.screenMap = new LinkedHashMap();
        this.backStackScreenKeysCopy = new ArrayList();
        savedStateRegistryOwner.getSavedStateRegistry().registerSavedStateProvider("fragment_navigator_key_state_navigator", new AnonymousClass1());
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistryOwner.getSavedStateRegistry().consumeRestoredStateForKey("fragment_navigator_key_state_navigator");
        if (bundleConsumeRestoredStateForKey != null) {
            restoreFromBundle(bundleConsumeRestoredStateForKey);
        }
    }

    private final FragmentTransaction applyCustomAnimations(FragmentTransaction fragmentTransaction, boolean z) {
        if (z) {
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            return fragmentTransaction;
        }
        fragmentTransaction.setCustomAnimations(com.onfido.android.sdk.capture.R.anim.onfido_slide_in_right, com.onfido.android.sdk.capture.R.anim.onfido_slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        return fragmentTransaction;
    }

    public static /* synthetic */ FragmentTransaction applyCustomAnimations$default(FragmentNavigationManager fragmentNavigationManager, FragmentTransaction fragmentTransaction, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fragmentNavigationManager.applyCustomAnimations(fragmentTransaction, z);
    }

    private final void commitNewFragment(Screen screen, boolean addToBackStack, boolean isBackNavigation) {
        String strScreenKey = screen.screenKey();
        FragmentTransaction reorderingAllowed = this.fragmentManager.beginTransaction().setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(reorderingAllowed, "setReorderingAllowed(...)");
        FragmentTransaction fragmentTransactionReplace = applyCustomAnimations(reorderingAllowed, isBackNavigation).replace(this.containerId, screen.createFragment(), strScreenKey);
        if (addToBackStack) {
            fragmentTransactionReplace.addToBackStack(screen.screenKey());
            this.backStackScreenKeysCopy.add(screen.screenKey());
            this.screenMap.put(strScreenKey, screen);
        }
        fragmentTransactionReplace.commit();
    }

    public static /* synthetic */ void commitNewFragment$default(FragmentNavigationManager fragmentNavigationManager, Screen screen, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        fragmentNavigationManager.commitNewFragment(screen, z, z3);
    }

    private final void performBack() {
        if (this.backStackScreenKeysCopy.isEmpty()) {
            return;
        }
        this.fragmentManager.popBackStack();
        List<String> list = this.backStackScreenKeysCopy;
        this.screenMap.remove(list.remove(v.j(list)));
    }

    private final void performBackTo(BackTo command) {
        if (command.getScreen() == null) {
            popToRoot();
            return;
        }
        if (this.backStackScreenKeysCopy.isEmpty() || !this.backStackScreenKeysCopy.contains(command.getScreen().screenKey())) {
            commitNewFragment$default(this, command.getScreen(), false, true, 2, null);
            return;
        }
        List<String> list = this.backStackScreenKeysCopy;
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (Object obj2 : list) {
            boolean z3 = !Intrinsics.f(command.getScreen().screenKey(), (String) obj2);
            if (!z) {
                break;
            }
            arrayList.add(obj2);
            z = z3;
        }
        List listB0 = d0.B0(this.backStackScreenKeysCopy, d0.i1(arrayList));
        this.backStackScreenKeysCopy.clear();
        a0.x(arrayList, this.backStackScreenKeysCopy);
        a0.C(d0.i1(listB0), this.screenMap.keySet());
        this.fragmentManager.popBackStack((String) d0.m0(this.backStackScreenKeysCopy), 0);
    }

    private final void performForward(Forward command) {
        commitNewFragment$default(this, command.getScreen(), false, false, 6, null);
    }

    private final void performReplace(Replace command) {
        if (this.backStackScreenKeysCopy.isEmpty()) {
            commitNewFragment$default(this, command.getScreen(), false, false, 6, null);
            return;
        }
        this.fragmentManager.popBackStack();
        List<String> list = this.backStackScreenKeysCopy;
        this.screenMap.remove(list.remove(v.j(list)));
        commitNewFragment$default(this, command.getScreen(), false, false, 6, null);
    }

    private final void popToRoot() {
        this.backStackScreenKeysCopy.clear();
        this.screenMap.clear();
        this.fragmentManager.popBackStack(null, 1);
    }

    private final void restoreFromBundle(Bundle bundle) {
        List<String> list = this.backStackScreenKeysCopy;
        Iterable stringArrayList = bundle.getStringArrayList("backStackScreenKeys");
        if (stringArrayList == null) {
            stringArrayList = f0.f322471a;
        }
        a0.x(stringArrayList, list);
        Iterable stringArrayList2 = bundle.getStringArrayList("screenMapKeys");
        if (stringArrayList2 == null) {
            stringArrayList2 = f0.f322471a;
        }
        List parcelableArrayList = bundle.getParcelableArrayList("screenMapValues");
        if (parcelableArrayList == null) {
            parcelableArrayList = f0.f322471a;
        }
        Map<String, Screen> map = this.screenMap;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : stringArrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new Pair((String) obj2, parcelableArrayList.get(i)));
            i = i2;
        }
        map.putAll(r0.t(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("backStackScreenKeys", new ArrayList<>(this.backStackScreenKeysCopy));
        bundle.putStringArrayList("screenMapKeys", new ArrayList<>(this.screenMap.keySet()));
        bundle.putParcelableArrayList("screenMapValues", new ArrayList<>(this.screenMap.values()));
        return bundle;
    }

    private final void syncWithFragmentManagerBackstack() {
        this.backStackScreenKeysCopy.clear();
        int backStackEntryCount = this.fragmentManager.getBackStackEntryCount();
        for (int i = 0; i < backStackEntryCount; i++) {
            FragmentManager.BackStackEntry backStackEntryAt = this.fragmentManager.getBackStackEntryAt(i);
            Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "getBackStackEntryAt(...)");
            List<String> list = this.backStackScreenKeysCopy;
            String name = backStackEntryAt.getName();
            if (name != null) {
                list.add(name);
            }
        }
        Set setI1 = d0.i1(this.backStackScreenKeysCopy);
        Map<String, Screen> map = this.screenMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Screen> entry : map.entrySet()) {
            if (setI1.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.screenMap.clear();
        this.screenMap.putAll(linkedHashMap);
    }

    private final <T> List<T> takeWhileInclusive(List<? extends T> list, Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (T t2 : list) {
            boolean zBooleanValue = ((Boolean) function1.invoke(t2)).booleanValue();
            if (!z) {
                break;
            }
            arrayList.add(t2);
            z = zBooleanValue;
        }
        return arrayList;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.NavigationManager
    public void executeCommands(@NotNull List<? extends NavigationCommand> navigationCommands) {
        Intrinsics.checkNotNullParameter(navigationCommands, "navigationCommands");
        this.fragmentManager.executePendingTransactions();
        syncWithFragmentManagerBackstack();
        for (NavigationCommand navigationCommand : navigationCommands) {
            if (Intrinsics.f(navigationCommand, Back.INSTANCE)) {
                performBack();
            } else if (navigationCommand instanceof Forward) {
                performForward((Forward) navigationCommand);
            } else if (navigationCommand instanceof Replace) {
                performReplace((Replace) navigationCommand);
            } else if (navigationCommand instanceof BackTo) {
                performBackTo((BackTo) navigationCommand);
            }
        }
    }

    @NotNull
    public final List<Screen> getCurrentScreensSnapshot() {
        List<String> list = this.backStackScreenKeysCopy;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            Screen screen = this.screenMap.get((String) it8.next());
            if (screen != null) {
                arrayList.add(screen);
            }
        }
        return arrayList;
    }
}
