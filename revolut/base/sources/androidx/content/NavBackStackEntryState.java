package androidx.content;

import android.content.Context;
import android.os.Bundle;
import androidx.content.internal.NavBackStackEntryStateImpl;
import androidx.content.internal.NavContext;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0011\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u0016\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0019\u0010\u0016\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "", "Landroidx/navigation/NavBackStackEntry;", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "state", "(Landroid/os/Bundle;)V", "writeToState", "()Landroid/os/Bundle;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "args", "prepareArgs", "(Landroid/os/Bundle;Landroidx/navigation/internal/NavContext;)Landroid/os/Bundle;", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "impl", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "getId", "()Ljava/lang/String;", "id", "", "getDestinationId", "()I", "destinationId", "getArgs", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryState {

    @NotNull
    private final NavBackStackEntryStateImpl impl;

    public NavBackStackEntryState(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.impl = new NavBackStackEntryStateImpl(entry, entry.getDestination().getId());
    }

    public final Bundle getArgs() {
        return this.impl.getArgs();
    }

    public final int getDestinationId() {
        return this.impl.getDestinationId();
    }

    @NotNull
    public final String getId() {
        return this.impl.getId();
    }

    @NotNull
    public final NavBackStackEntry instantiate(@NotNull NavContext context, @NotNull NavDestination destination, @NotNull Lifecycle.State hostLifecycleState, NavControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle args = getArgs();
        return this.impl.instantiate(context, destination, args != null ? prepareArgs(args, context) : null, hostLifecycleState, viewModel);
    }

    public final Bundle prepareArgs(@NotNull Bundle args, @NotNull NavContext context) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = context.getContext();
        args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        return args;
    }

    @NotNull
    public final Bundle writeToState() {
        return this.impl.writeToState$navigation_runtime_release();
    }

    public NavBackStackEntryState(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.setClassLoader(NavBackStackEntryState.class.getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(state);
    }
}
