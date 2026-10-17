package cl;

import com.onfido.api.client.token.Token;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends Token {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f24910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String tokenValue, String str) {
        super(tokenValue, str);
        Intrinsics.checkNotNullParameter(tokenValue, "tokenValue");
    }
}
