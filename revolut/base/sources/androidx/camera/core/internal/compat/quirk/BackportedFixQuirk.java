package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.core.backported.fixes.BackportedFixManager;
import androidx.core.backported.fixes.KnownIssue;
import hzl.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "getKnownIssue", "Landroidx/core/backported/fixes/KnownIssue;", "hasIssue", "", "Companion", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BackportedFixQuirk implements Quirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy backportedFixManager$delegate = j.b(new a(1));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk$Companion;", "", "<init>", "()V", "backportedFixManager", "Landroidx/core/backported/fixes/BackportedFixManager;", "getBackportedFixManager", "()Landroidx/core/backported/fixes/BackportedFixManager;", "backportedFixManager$delegate", "Lkotlin/Lazy;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BackportedFixManager getBackportedFixManager() {
            return (BackportedFixManager) BackportedFixQuirk.backportedFixManager$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackportedFixManager backportedFixManager_delegate$lambda$0() {
        return new BackportedFixManager();
    }

    @NotNull
    public abstract KnownIssue getKnownIssue();

    public final boolean hasIssue() {
        return !INSTANCE.getBackportedFixManager().isFixed(getKnownIssue());
    }
}
