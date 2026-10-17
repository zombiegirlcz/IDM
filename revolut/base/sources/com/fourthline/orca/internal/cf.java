package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaFonts;
import com.fourthline.orca.internal.gj0;
import com.fourthline.orca.internal.wi0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class cf implements ij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaFlavor f27450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableStateFlow f27451c;

    public cf(Context context, OrcaFlavor flavor, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        this.f27449a = context;
        this.f27450b = flavor;
        this.f27451c = vkm.q.c(a(context, z, z3));
    }

    private final String b(File file) {
        String str = file.getAbsolutePath() + "/styling/";
        new File(str).mkdirs();
        return str + "styling.json";
    }

    @Override // com.fourthline.orca.internal.ij0
    public StateFlow a() {
        return vkm.q.h(this.f27451c);
    }

    @Override // com.fourthline.orca.internal.ij0
    public void a(boolean z, boolean z3) {
        this.f27451c.setValue(a(this.f27449a, z, z3));
    }

    private final OrcaFlavor b() {
        OrcaFlavor orcaFlavor = this.f27450b;
        return OrcaFlavor.copy$default(orcaFlavor, null, null, null, new OrcaFonts(new OrcaFonts.SystemFont(orcaFlavor.getFonts().getScreenHeader().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getScreenTitle().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getScreenMessage().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getPopupHeader().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getPopupMessage().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getPopupTitle().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getPrimaryButton().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getSecondaryButton().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getInputField().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getInputFieldPlaceholder().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getInputFieldTitle().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getInputFieldStatus().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getScannerInstructionText().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getConfirmationScreenTitle().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getConfirmationScreenCheckpoints().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getTableElementTitle().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getTableElementDescription().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getInstructionsLink().getSize()), new OrcaFonts.SystemFont(this.f27450b.getFonts().getHintText().getSize())), null, 23, null);
    }

    private final gj0 a(Context context, boolean z) {
        File assetsFourthlineDirectory = ContextExtensionsKt.getAssetsFourthlineDirectory(context);
        try {
            String strB = b(assetsFourthlineDirectory);
            wi0.Companion companion = wi0.INSTANCE;
            return new gj0.b(companion.a(strB, companion.a(strB), a(assetsFourthlineDirectory)), a(context), z);
        } catch (Exception unused) {
            return new gj0.a(b(), z);
        }
    }

    private final gj0 a(Context context, boolean z, boolean z3) {
        if (z) {
            return a(context, z3);
        }
        return new gj0.a(a(context), z3);
    }

    private final String a(File file) {
        String str = file.getAbsolutePath() + "/fonts/";
        new File(str).mkdirs();
        return str;
    }

    private final OrcaFlavor a(Context context) {
        return vc.b(context) ? b() : this.f27450b;
    }
}
