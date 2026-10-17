package androidx.content.internal;

import android.os.Bundle;
import androidx.content.NavBackStackEntry;
import androidx.content.NavControllerViewModel;
import androidx.content.NavDestination;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0013\u0010\u000e\u001a\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0013\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\rR\u001e\u0010%\u001a\u00060\bj\u0002`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\r¨\u0006("}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "Landroidx/navigation/NavBackStackEntry;", "entry", "", "destId", "<init>", "(Landroidx/navigation/NavBackStackEntry;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "state", "(Landroid/os/Bundle;)V", "writeToState$navigation_runtime_release", "()Landroid/os/Bundle;", "writeToState", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/NavDestination;", "destination", "args", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "", "id", "Ljava/lang/String;", "getId$navigation_runtime_release", "()Ljava/lang/String;", "destinationId", "I", "getDestinationId$navigation_runtime_release", "()I", "Landroid/os/Bundle;", "getArgs$navigation_runtime_release", "savedState", "getSavedState$navigation_runtime_release", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryStateImpl {
    private final Bundle args;
    private final int destinationId;

    @NotNull
    private final String id;

    @NotNull
    private final Bundle savedState;

    public NavBackStackEntryStateImpl(@NotNull NavBackStackEntry entry, int i) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.id = entry.getId();
        this.destinationId = i;
        this.args = entry.getArguments();
        r0.g();
        Pair[] pairArr = new Pair[0];
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        this.savedState = bundleBundleOf;
        entry.saveState(bundleBundleOf);
    }

    /* JADX INFO: renamed from: getArgs$navigation_runtime_release, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: getDestinationId$navigation_runtime_release, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    @NotNull
    /* JADX INFO: renamed from: getId$navigation_runtime_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final NavBackStackEntry instantiate(@NotNull NavContext context, @NotNull NavDestination destination, Bundle args, @NotNull Lifecycle.State hostLifecycleState, NavControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        return NavBackStackEntry.INSTANCE.create(context, destination, args, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @NotNull
    public final Bundle writeToState$navigation_runtime_release() {
        r0.g();
        Pair[] pairArr = new Pair[0];
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        SavedStateWriter.m3630putStringimpl(bundleM3615constructorimpl, "nav-entry-state:id", this.id);
        SavedStateWriter.m3621putIntimpl(bundleM3615constructorimpl, "nav-entry-state:destination-id", this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            r0.g();
            Pair[] pairArr2 = new Pair[0];
            bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m3615constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m3628putSavedStateimpl(bundleM3615constructorimpl, "nav-entry-state:args", bundleBundleOf2);
        SavedStateWriter.m3628putSavedStateimpl(bundleM3615constructorimpl, "nav-entry-state:saved-state", this.savedState);
        return bundleBundleOf;
    }

    public NavBackStackEntryStateImpl(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = SavedStateReader.m3607getStringimpl(SavedStateReader.m3590constructorimpl(state), "nav-entry-state:id");
        this.destinationId = SavedStateReader.m3599getIntimpl(SavedStateReader.m3590constructorimpl(state), "nav-entry-state:destination-id");
        this.args = SavedStateReader.m3604getSavedStateimpl(SavedStateReader.m3590constructorimpl(state), "nav-entry-state:args");
        this.savedState = SavedStateReader.m3604getSavedStateimpl(SavedStateReader.m3590constructorimpl(state), "nav-entry-state:saved-state");
    }
}
