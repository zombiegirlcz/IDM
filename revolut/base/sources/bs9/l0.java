package bs9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements cli.n {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs9.d f18113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final du9.b f18114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18115c;

    public l0(fs9.d chatItemsMapper, js9.c buttonsMapper, fs9.g groupChatNavBarMapper, du9.b disclaimerProvider, a groupChatActionsBarStateMapper, fs9.e keyboardAnimationStateMapper, gs9.b mentionPickerItemsMapper) {
        Intrinsics.checkNotNullParameter(chatItemsMapper, "chatItemsMapper");
        Intrinsics.checkNotNullParameter(buttonsMapper, "buttonsMapper");
        Intrinsics.checkNotNullParameter(groupChatNavBarMapper, "groupChatNavBarMapper");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(groupChatActionsBarStateMapper, "groupChatActionsBarStateMapper");
        Intrinsics.checkNotNullParameter(keyboardAnimationStateMapper, "keyboardAnimationStateMapper");
        Intrinsics.checkNotNullParameter(mentionPickerItemsMapper, "mentionPickerItemsMapper");
        this.f18113a = chatItemsMapper;
        this.f18114b = disclaimerProvider;
        this.f18115c = groupChatActionsBarStateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (x) iii.c.f(domainState.f18117b, new bnj.n(this, domainState, 19), new a8a.a(this, domainState, 7), new b1c.p(this, domainState, 20));
    }
}
