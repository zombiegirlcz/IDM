package tn5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ln5.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // ln5.a
    public final boolean a(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        int length = address.length();
        return 8 <= length && length < 91;
    }
}
