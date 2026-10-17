package sg0;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import sdl.y;
import ui0.l;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    @NotNull
    public static final b Companion = b.f262575a;

    default l a() {
        return null;
    }

    default Function0 b() {
        return new y(14);
    }

    boolean c();

    Function0 d();
}
