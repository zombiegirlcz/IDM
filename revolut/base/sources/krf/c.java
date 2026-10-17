package krf;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements Serializable {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    private c() {
    }

    public abstract String a();
}
