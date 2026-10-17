package com.revolut.feature.permissions.flow;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Step;
import hx7.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qqj.g;
import qr0.i;
import r38.m;
import r7a.d;
import r7a.f;
import r7a.j;
import r7a.k;
import r7a.l;
import vkm.j2;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements d {

    @NotNull
    public static final j Companion = new j();
    public final PermissionsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f80338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.a f80339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PermissionsControllerContract$Permission[] f80340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qki.d f80341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.i f80342t;

    public b(PermissionsControllerContract$InputData inputData, i permissionRequester, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionRequester, "permissionRequester");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = inputData;
        this.f80338p = permissionRequester;
        this.f80339q = intentProvider;
        this.f80340r = (PermissionsControllerContract$Permission[]) inputData.f80328a.toArray(new PermissionsControllerContract$Permission[0]);
        this.f80341s = e.b(this, new PermissionsControllerContract$State(inputData.f80328a, J2()));
        this.f80342t = d8l.d.a(this, new r6f.i(this, 4));
    }

    public final LinkedHashMap I2() {
        PermissionsControllerContract$Permission[] permissionsControllerContract$PermissionArr = this.f80340r;
        int iB = q0.b(permissionsControllerContract$PermissionArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (PermissionsControllerContract$Permission permissionsControllerContract$Permission : permissionsControllerContract$PermissionArr) {
            linkedHashMap.put(permissionsControllerContract$Permission.f80329a, this.f80338p.d(permissionsControllerContract$Permission));
        }
        return linkedHashMap;
    }

    public final List J2() {
        List list = this.o.f80328a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (this.f80338p.l(((PermissionsControllerContract$Permission) obj2).f80329a)) {
                arrayList.add(obj2);
            }
        }
        return d0.P0(arrayList, new l());
    }

    public final boolean K2(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            PermissionsControllerContract$Permission permission = (PermissionsControllerContract$Permission) next;
            i iVar = this.f80338p;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(permission, "permission");
            if (iVar.d(permission) == r7a.b.EXPLANATION && (permission.f80331c instanceof PermissionsControllerContract$Explanation.PromptScreen)) {
                break;
            }
        }
        PermissionsControllerContract$Permission permissionsControllerContract$Permission = (PermissionsControllerContract$Permission) next;
        PermissionsControllerContract$Explanation permissionsControllerContract$Explanation = permissionsControllerContract$Permission != null ? permissionsControllerContract$Permission.f80331c : null;
        if ((permissionsControllerContract$Explanation instanceof PermissionsControllerContract$Explanation.None) || permissionsControllerContract$Explanation == null) {
            return false;
        }
        if (!(permissionsControllerContract$Explanation instanceof PermissionsControllerContract$Explanation.PromptScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        PermissionsControllerContract$Explanation.PromptScreen promptScreen = (PermissionsControllerContract$Explanation.PromptScreen) permissionsControllerContract$Explanation;
        Clause clause = promptScreen.f80325a;
        Clause clause2 = promptScreen.f80326b;
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(promptScreen.d, null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button(promptScreen.f80327c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        Clause clause3 = promptScreen.e;
        h.t2(this, this.f80342t, new PermissionsControllerContract$Step.Explanation(new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_LIST_ID", clause, clause2, mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, clause3 != null ? new PromptMarketingContentDelegate.Model.Button(clause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, null, null, null, null, null, null, null, null, null, null, 2095536), permissionsControllerContract$Permission), false, null, false, 12);
        return true;
    }

    public final void L2(r7a.i iVar, boolean z) {
        if (!z) {
            C2(iVar);
        } else {
            n2(new g(this, iVar, (Continuation) null, 3), new whi.b(6));
        }
    }

    @Override // yki.j
    public final void M0() {
        M2(false);
    }

    public final void M2(boolean z) {
        qki.d dVar = this.f80341s;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        boolean zIsEmpty = ((PermissionsControllerContract$State) j2Var.getValue()).f80332a.isEmpty();
        PermissionsControllerContract$Permission[] permissionsControllerContract$PermissionArr = this.f80340r;
        PermissionsControllerContract$Permission[] permissionsControllerContract$PermissionArr2 = (PermissionsControllerContract$Permission[]) Arrays.copyOf(permissionsControllerContract$PermissionArr, permissionsControllerContract$PermissionArr.length);
        i iVar = this.f80338p;
        boolean z3 = iVar.d(permissionsControllerContract$PermissionArr2) == r7a.b.ALLOWED;
        yki.i iVar2 = this.f80342t;
        if (zIsEmpty || z3) {
            L2(new r7a.h(iVar2.d() != null), z);
        }
        if (zIsEmpty || z3) {
            return;
        }
        PermissionsControllerContract$Permission permissionsControllerContract$Permission = (PermissionsControllerContract$Permission) d0.d0(((PermissionsControllerContract$State) j2Var2.getValue()).f80333b);
        PermissionsControllerContract$Explanation permissionsControllerContract$Explanation = permissionsControllerContract$Permission != null ? permissionsControllerContract$Permission.f80330b : null;
        if (!(permissionsControllerContract$Explanation instanceof PermissionsControllerContract$Explanation.None) && permissionsControllerContract$Explanation != null) {
            if (!(permissionsControllerContract$Explanation instanceof PermissionsControllerContract$Explanation.PromptScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            PermissionsControllerContract$Explanation.PromptScreen promptScreen = (PermissionsControllerContract$Explanation.PromptScreen) permissionsControllerContract$Explanation;
            Clause clause = promptScreen.f80325a;
            Clause clause2 = promptScreen.f80326b;
            PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(promptScreen.d, null);
            PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button(promptScreen.f80327c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
            Clause clause3 = promptScreen.e;
            h.t2(this, iVar2, new PermissionsControllerContract$Step.Introduction(new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_LIST_ID", clause, clause2, mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, clause3 != null ? new PromptMarketingContentDelegate.Model.Button(clause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, null, null, null, null, null, null, null, null, null, null, 2095536), permissionsControllerContract$Permission), false, null, false, 12);
            return;
        }
        List list = ((PermissionsControllerContract$State) j2Var2.getValue()).f80333b;
        if (!list.isEmpty()) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((PermissionsControllerContract$Permission) it8.next()).f80329a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            iVar.k((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        if (K2(((PermissionsControllerContract$State) j2Var2.getValue()).f80332a)) {
            return;
        }
        int i = k.f252058a[iVar.d((PermissionsControllerContract$Permission[]) Arrays.copyOf(permissionsControllerContract$PermissionArr, permissionsControllerContract$PermissionArr.length)).ordinal()];
        if (i == 1) {
            L2(new r7a.h(iVar2.d() != null), z);
        } else if (i == 2) {
            L2(new r7a.e(I2()), z);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            L2(new f(I2()), z);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z = this.f226127l && j2 == 0;
        if (z || j2 > 0) {
            H2(this.f80341s, new m(this, 19));
            PermissionsControllerContract$Step permissionsControllerContract$Step = (PermissionsControllerContract$Step) this.f80342t.d();
            if (permissionsControllerContract$Step != null) {
                if (this.f80338p.l(permissionsControllerContract$Step.getF80337b().f80329a)) {
                    return;
                }
            }
            M2(z);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f80341s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80342t;
    }
}
