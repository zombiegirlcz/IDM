package androidx.view.compose.internal;

import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import androidx.view.BackEventCompat;
import androidx.view.OnBackPressedCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/activity/compose/internal/BackHandlerCompat;", "", "Landroidx/navigationevent/NavigationEventInfo;", "info", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;)V", "Landroidx/activity/BackEventCompat;", "event", "", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "()V", "onBackCancelled", "Landroidx/navigationevent/NavigationEventInfo;", "getInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "Landroidx/navigationevent/NavigationEventHandler;", "navigationEventHandler", "Landroidx/navigationevent/NavigationEventHandler;", "getNavigationEventHandler", "()Landroidx/navigationevent/NavigationEventHandler;", "", "value", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BackHandlerCompat {

    @NotNull
    private final NavigationEventInfo info;

    @NotNull
    private final NavigationEventHandler<NavigationEventInfo> navigationEventHandler;

    @NotNull
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1
        {
            super(false);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackCancelled() {
            this.this$0.onBackCancelled();
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.this$0.onBackCompleted();
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackProgressed(BackEventCompat backEvent) {
            this.this$0.onBackProgressed(backEvent);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackStarted(BackEventCompat backEvent) {
            this.this$0.onBackStarted(backEvent);
        }
    };

    public BackHandlerCompat(@NotNull final NavigationEventInfo navigationEventInfo) {
        this.info = navigationEventInfo;
        this.navigationEventHandler = new NavigationEventHandler<NavigationEventInfo>(navigationEventInfo) { // from class: androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1
            @Override // androidx.navigationevent.NavigationEventHandler
            public void onBackCancelled() {
                this.this$0.onBackCancelled();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public void onBackCompleted() {
                this.this$0.onBackCompleted();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public void onBackProgressed(NavigationEvent event) {
                this.this$0.onBackProgressed(new BackEventCompat(event));
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            public void onBackStarted(NavigationEvent event) {
                this.this$0.onBackStarted(new BackEventCompat(event));
            }
        };
    }

    @NotNull
    public final NavigationEventHandler<NavigationEventInfo> getNavigationEventHandler() {
        return this.navigationEventHandler;
    }

    @NotNull
    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public boolean isBackEnabled() {
        return this.onBackPressedCallback.getIsEnabled() && this.navigationEventHandler.isBackEnabled();
    }

    public void onBackCancelled() {
    }

    public abstract void onBackCompleted();

    public void onBackProgressed(@NotNull BackEventCompat event) {
    }

    public void onBackStarted(@NotNull BackEventCompat event) {
    }

    public void setBackEnabled(boolean z) {
        this.onBackPressedCallback.setEnabled(z);
        this.navigationEventHandler.setBackEnabled(z);
    }
}
