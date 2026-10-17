package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0006\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CodeEditorDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/z3;", "Lip0/cb;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/a4", "ip0/ab", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CodeEditorDelegate extends BaseRecyclerViewDelegate<z3, ip0.cb> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52100c;
    public final e01.a d;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CodeEditorDelegate$a$a, reason: collision with other inner class name */
        public static final class C0399a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0399a f52101a = new C0399a();

            private C0399a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f52102a = new b();

            private b() {
            }
        }

        private a() {
        }
    }

    public CodeEditorDelegate() {
        super(R$layout.internal_delegate_code_editor, new ip0.h8(26));
        this.f52100c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.cb(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    public final efm.r p() {
        efm.r map = this.f52100c.f121375b.map(new ip0.a9(new ip0.za(0), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.cb holder, z3 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        Context context = holder.itemView.getContext();
        View view = holder.itemView;
        Intrinsics.h(context);
        int i2 = data.k;
        boolean z = data.f55670h;
        view.setPadding(kli.a.w(i2, context), kli.a.w(data.i, context), kli.a.w(data.f55672l, context), kli.a.w(data.f55671j, context));
        CodeEditor codeEditor = holder.f;
        codeEditor.setInputVariant(data.d);
        codeEditor.setSecurityInput(data.f55669g);
        if (!payloads.isEmpty()) {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CodeEditorDelegate.Payload");
                a4 a4Var = (a4) obj2;
                Boolean bool = a4Var.d;
                if (bool != null) {
                    codeEditor.setAutoFocusEnabled(bool.booleanValue());
                }
                ip0.ab abVar = a4Var.f53664b;
                if (abVar != null) {
                    codeEditor.setMode(abVar);
                }
                String str = a4Var.f53663a;
                if (str != null) {
                    codeEditor.setCode(str);
                }
                if (a4Var.e) {
                    codeEditor.setLoadingState(z);
                }
            }
            return;
        }
        codeEditor.setAutoFocusEnabled(data.e);
        codeEditor.setMode(data.f55668c);
        codeEditor.setCode(data.f55667b);
        codeEditor.setLoadingState(z);
        this.f52100c.a(codeEditor.f59037g, holder);
        this.d.a(codeEditor.f59038h, holder);
        int i3 = ip0.db.f163863a[data.f.ordinal()];
        if (i3 == 1) {
            ViewGroup.LayoutParams layoutParams = codeEditor.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.gravity = 1;
            codeEditor.setLayoutParams(layoutParams2);
            return;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams3 = codeEditor.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = -2;
        layoutParams4.gravity = 8388611;
        codeEditor.setLayoutParams(layoutParams4);
    }
}
