package cul;

import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p2 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderEditScreenContract$InputData f109153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f109154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eul.h f109155c;
    public final zrc.e d;
    public final vfl.a e;
    public final eul.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dsl.a f109156g;

    public p2(InvestOrderEditScreenContract$InputData inputData, twg.c toolbarStateMapper, eul.h contentItemsStateMapper, eul.m nextButtonStateMapper, zrc.e settingsButtonStateMapper, vfl.a keyboardSuggestionsMapper, eul.l footerStateMapper, dsl.a analyticsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(contentItemsStateMapper, "contentItemsStateMapper");
        Intrinsics.checkNotNullParameter(nextButtonStateMapper, "nextButtonStateMapper");
        Intrinsics.checkNotNullParameter(settingsButtonStateMapper, "settingsButtonStateMapper");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsMapper, "keyboardSuggestionsMapper");
        Intrinsics.checkNotNullParameter(footerStateMapper, "footerStateMapper");
        Intrinsics.checkNotNullParameter(analyticsProvider, "analyticsProvider");
        this.f109153a = inputData;
        this.f109154b = toolbarStateMapper;
        this.f109155c = contentItemsStateMapper;
        this.d = settingsButtonStateMapper;
        this.e = keyboardSuggestionsMapper;
        this.f = footerStateMapper;
        this.f109156g = analyticsProvider;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 cul.g0, still in use, count: 3, list:
          (r3v0 cul.g0) from 0x013f: MOVE (r16v0 cul.g0) = (r3v0 cul.g0)
          (r3v0 cul.g0) from 0x012e: MOVE (r16v2 cul.g0) = (r3v0 cul.g0)
          (r3v0 cul.g0) from 0x0113: MOVE (r16v4 cul.g0) = (r3v0 cul.g0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r18) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.p2.c(cli.j):cli.o");
    }
}
