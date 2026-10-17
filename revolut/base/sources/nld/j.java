package nld;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f217122a = new Regex("%(?:\\d+\\$)?s");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f217123b = new Regex("%(?!s)[a-z]");

    public static final class a {
        private a() {
        }
    }
}
