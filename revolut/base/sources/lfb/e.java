package lfb;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f194841a = new Regex("^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f194842b = new Regex("^\\+?[0-9]{1,15}$");

    public static final class a {
        private a() {
        }
    }
}
