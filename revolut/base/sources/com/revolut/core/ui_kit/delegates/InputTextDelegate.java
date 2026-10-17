package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.jr;
import ip0.lr;
import ip0.mr;
import ip0.nr;
import ip0.or;
import ip0.pr;
import ip0.qr;
import ip0.rr;
import ip0.sr;
import ip0.tr;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0005\u0003\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;", "Lip0/tr;", "Companion", "Model", "ip0/mr", "ip0/nr", "ip0/or", "TextData", "ip0/sr", "ip0/jr", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTextDelegate extends BaseRecyclerViewDelegate<Model, tr> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f52574c;
    public final WeakHashMap d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52576h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f52577j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f52579m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f52598b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextData(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextData[i];
            }
        }

        public TextData(String listId, CharSequence text) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f52597a = listId;
            this.f52598b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextData)) {
                return false;
            }
            TextData textData = (TextData) obj2;
            return Intrinsics.f(this.f52597a, textData.f52597a) && Intrinsics.f(this.f52598b, textData.f52598b);
        }

        public final int hashCode() {
            return this.f52598b.hashCode() + (this.f52597a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f52597a);
            TextUtils.writeToParcel(this.f52598b, dest, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.InputTextDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InputTextDelegate() {
        this(null);
    }

    public static void s(InputText inputText, sr srVar) {
        if (Intrinsics.f(srVar, rr.f166227a)) {
            inputText.setSingleLine(true);
            inputText.setMaxLines(1);
            return;
        }
        if (Intrinsics.f(srVar, pr.f165860a)) {
            inputText.setSingleLine(false);
            inputText.setMinLines(1);
            inputText.setMaxLines(6);
        } else if (Intrinsics.f(srVar, qr.f166041a)) {
            inputText.setSingleLine(false);
            inputText.setMinLines(6);
            inputText.setMaxLines(6);
        } else {
            if (!(srVar instanceof jr)) {
                throw new NoWhenBranchMatchedException();
            }
            inputText.setSingleLine(false);
            inputText.setMinLines(1);
            inputText.setMaxLines(((jr) srVar).f164902a);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new tr(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_input_text));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        q((tr) holder);
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public final void p(Model model, tr trVar) {
        int iA;
        int i = s7.f54695a[model.N.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            View itemView = trVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, model, itemView, false, null, 24);
            return;
        }
        View itemView2 = trVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        qv0.c cVar = model.R;
        boolean z = cVar instanceof c.e;
        qv0.c cVar2 = c.d.f249513a;
        if (z || Intrinsics.f(cVar, cVar2)) {
            iA = 0;
        } else {
            cVar2 = model.R;
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView2, "getContext(...)", 8.0f);
        }
        qv0.c cVar3 = cVar2;
        Context context = itemView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        or0.b.b(this, cVar3, itemView2, false, context, null, null, 48);
        itemView2.setPadding(iA, 0, iA, iA);
    }

    public final void q(tr holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InputText inputText = holder.f;
        InputText inputText2 = holder.f;
        MaskedTextInputEditText innerEditText = inputText.getInnerEditText();
        WeakHashMap weakHashMap = this.d;
        yz0.b bVar = (yz0.b) weakHashMap.get(innerEditText);
        if (bVar != null) {
            bVar.a();
        }
        weakHashMap.remove(inputText2.getInnerEditText());
        inputText2.getInnerEditText().setMaskingDelegate(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.tr r29, final com.revolut.core.ui_kit.delegates.InputTextDelegate.Model r30, int r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.InputTextDelegate.p(ip0.tr, com.revolut.core.ui_kit.delegates.InputTextDelegate$Model, int, java.util.List):void");
    }

    public final yz0.b t(Model model, tr trVar) {
        Function2 function2 = this.f52574c;
        if (function2 == null) {
            return null;
        }
        InputText inputText = trVar.f;
        InputText inputText2 = trVar.f;
        MaskedTextInputEditText innerEditText = inputText.getInnerEditText();
        WeakHashMap weakHashMap = this.d;
        yz0.b bVar = (yz0.b) weakHashMap.get(innerEditText);
        yz0.b bVar2 = (yz0.b) function2.invoke(model, inputText2);
        if (Intrinsics.f(bVar, bVar2)) {
            if (bVar2 != null) {
                bVar2.a();
            }
            return bVar;
        }
        if (bVar != null) {
            bVar.a();
        }
        weakHashMap.put(inputText2.getInnerEditText(), bVar2);
        inputText2.setMaskingDelegate(bVar2);
        return bVar2;
    }

    public InputTextDelegate(Function2 function2) {
        super(R$layout.internal_delegate_input_text, new hq(5));
        this.f52574c = function2;
        this.d = new WeakHashMap();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f52575g = new e01.a();
        this.f52576h = new e01.a();
        this.i = new e01.a();
        this.f52577j = new e01.a();
        this.k = new e01.a();
        this.f52578l = new e01.a();
        this.f52579m = v0.a.d("create(...)");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/r7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {
        public final boolean A;
        public final String B;
        public final Integer C;
        public final boolean D;
        public final nr E;
        public final boolean F;
        public final boolean G;
        public final rx0.f H;
        public final boolean I;
        public final boolean J;
        public final int K;
        public final boolean L;
        public final Clause M;
        public final r7 N;
        public final String O;
        public final Object P;
        public Parcelable Q;
        public qv0.c R;
        public p31.c S;
        public p31.c T;
        public p31.c U;
        public p31.c V;
        public int W;
        public int X;
        public final int Y;
        public final int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52582c;
        public final Clause d;
        public final rx0.j e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f52583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f52584h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Image f52585j;
        public final InputText.Companion.AbstractC0443a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Image f52586l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Image f52587m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f52588n;
        public final Integer o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f52589p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f52590q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f52591r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f52592s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f52593t;
        public final mr u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final List f52594w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final sr f52595x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f52596y;
        public final boolean z;

        public Model(String listId, Clause clause, Clause clause2, Clause clause3, Clause clause4, Image image, Image image2, boolean z, Integer num, boolean z3, boolean z4, int i, boolean z6, int i2, boolean z11, boolean z12, boolean z29, List list, boolean z31, boolean z41, int i3, boolean z49, boolean z54, Object obj2, int i5, int i6) {
            Clause clause5 = (i5 & 4) != 0 ? null : clause2;
            Clause clause6 = (i5 & 8) != 0 ? null : clause3;
            boolean z74 = (i5 & 64) == 0;
            Clause clause7 = (i5 & 128) != 0 ? null : clause4;
            Image image3 = (i5 & 4096) != 0 ? null : image;
            Image image4 = (i5 & 8192) != 0 ? null : image2;
            boolean z83 = (i5 & 16384) != 0 ? false : z;
            Integer num2 = (32768 & i5) != 0 ? null : num;
            boolean z89 = (131072 & i5) != 0 ? false : z3;
            boolean z96 = (262144 & i5) != 0 ? true : z4;
            boolean z100 = (524288 & i5) != 0 ? z96 : true;
            int i21 = (2097152 & i5) != 0 ? 16385 : i;
            zhm.f0 editorActions = zhm.f0.f322471a;
            boolean z101 = (16777216 & i5) != 0 ? true : z6;
            int i22 = (33554432 & i5) != 0 ? Integer.MAX_VALUE : i2;
            boolean z102 = (67108864 & i5) != 0 ? true : z11;
            boolean z103 = (134217728 & i5) != 0 ? false : z12;
            Integer num3 = (536870912 & i5) != 0 ? null : 1;
            boolean z104 = (1073741824 & i5) != 0 ? false : z29;
            List inputFilters = (i5 & Integer.MIN_VALUE) != 0 ? editorActions : list;
            boolean z105 = (i6 & 1) != 0 ? false : z31;
            rx0.f backgroundStateList = rx0.f.DEFAULT;
            boolean z106 = (i6 & 8) != 0;
            boolean z107 = (i6 & 16) != 0 ? true : z41;
            int i32 = (i6 & 32) != 0 ? 0 : i3;
            boolean z108 = (i6 & 64) != 0 ? false : z49;
            boolean z109 = (i6 & 128) != 0 ? false : z54;
            Object obj3 = (i6 & 512) != 0 ? null : obj2;
            r7 groupingMode = r7.MULTIPLE;
            int i33 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            InputText.Companion.AbstractC0443a.C0444a prefixImageMode = InputText.Companion.AbstractC0443a.C0444a.f59115a;
            Intrinsics.checkNotNullParameter(prefixImageMode, "prefixImageMode");
            Intrinsics.checkNotNullParameter(editorActions, "editorActions");
            Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
            Intrinsics.checkNotNullParameter(backgroundStateList, "backgroundStateList");
            Intrinsics.checkNotNullParameter(groupingMode, "groupingMode");
            rx0.j jVar = rx0.j.OnFocus;
            lr lrVar = new lr(i21);
            InputTextDelegate.INSTANCE.getClass();
            this(listId, clause, clause5, clause6, false, jVar, z74, clause7, null, null, prefixImageMode, image3, image4, z83, num2, null, z89, z96, z100, z96, lrVar, 0, editorActions, z101 ? rr.f166227a : new jr(i22), z102, z103, null, num3, z104, inputFilters, z105, false, backgroundStateList, z106, z107, i32, z108, z109, null, obj3, null, groupingMode, i33, i33, i33, i33, 16, 0);
        }

        public static Model e(Model model, Image image, ResourceImage resourceImage, int i) {
            boolean z;
            boolean z3;
            Integer num;
            boolean z4;
            String listId = model.f52580a;
            Clause clause = model.f52581b;
            Clause clause2 = model.f52582c;
            Clause clause3 = model.d;
            rx0.j placeholderMode = model.e;
            boolean z6 = model.f;
            Clause clause4 = model.f52583g;
            Clause clause5 = model.f52584h;
            Clause clause6 = model.i;
            Image image2 = model.f52585j;
            InputText.Companion.AbstractC0443a prefixImageMode = model.k;
            Image image3 = (i & 2048) != 0 ? model.f52586l : image;
            Image image4 = (i & 4096) != 0 ? model.f52587m : resourceImage;
            boolean z11 = model.f52588n;
            Image image5 = image3;
            Image image6 = image4;
            Integer num2 = model.o;
            Integer num3 = model.f52589p;
            boolean z12 = model.f52590q;
            boolean z29 = model.f52591r;
            boolean z31 = model.f52592s;
            boolean z41 = model.f52593t;
            mr inputType = model.u;
            int i2 = model.v;
            List editorActions = model.f52594w;
            sr style = model.f52595x;
            if ((i & 16777216) != 0) {
                z = z6;
                z3 = model.f52596y;
            } else {
                z = z6;
                z3 = false;
            }
            boolean z49 = z3;
            boolean z54 = (i & 33554432) != 0 ? model.z : true;
            boolean z74 = model.A;
            String str = model.B;
            Integer num4 = model.C;
            if ((i & PKIFailureInfo.duplicateCertReq) != 0) {
                num = num4;
                z4 = model.D;
            } else {
                num = num4;
                z4 = false;
            }
            nr inputFilters = model.E;
            boolean z83 = model.F;
            boolean z89 = model.G;
            rx0.f backgroundStateList = model.H;
            boolean z96 = model.I;
            boolean z100 = model.J;
            int i3 = model.K;
            boolean z101 = model.L;
            Clause clause7 = model.M;
            r7 groupingMode = model.N;
            String str2 = model.O;
            Object obj2 = model.P;
            Parcelable parcelable = model.Q;
            qv0.c positionInBox = model.R;
            p31.c cVar = model.S;
            p31.c cVar2 = model.T;
            p31.c cVar3 = model.U;
            p31.c cVar4 = model.V;
            int i5 = model.W;
            int i6 = model.X;
            int i21 = model.Y;
            int i22 = model.Z;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(placeholderMode, "placeholderMode");
            Intrinsics.checkNotNullParameter(prefixImageMode, "prefixImageMode");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            Intrinsics.checkNotNullParameter(editorActions, "editorActions");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
            Intrinsics.checkNotNullParameter(backgroundStateList, "backgroundStateList");
            Intrinsics.checkNotNullParameter(groupingMode, "groupingMode");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, clause, clause2, clause3, placeholderMode, z, clause4, clause5, clause6, image2, prefixImageMode, image5, image6, z11, num2, num3, z12, z29, z31, z41, inputType, i2, editorActions, style, z49, z54, z74, str, num, z4, inputFilters, z83, z89, backgroundStateList, z96, z100, i3, z101, clause7, groupingMode, str2, obj2, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, i5, i6, i21, i22);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new InputTextDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55191g() {
            return this.P;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53549a() {
            return this.f52580a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52580a, model.f52580a) && Intrinsics.f(this.f52581b, model.f52581b) && Intrinsics.f(this.f52582c, model.f52582c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f52583g, model.f52583g) && Intrinsics.f(this.f52584h, model.f52584h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52585j, model.f52585j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52586l, model.f52586l) && Intrinsics.f(this.f52587m, model.f52587m) && this.f52588n == model.f52588n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52589p, model.f52589p) && this.f52590q == model.f52590q && this.f52591r == model.f52591r && this.f52592s == model.f52592s && this.f52593t == model.f52593t && Intrinsics.f(this.u, model.u) && this.v == model.v && Intrinsics.f(this.f52594w, model.f52594w) && Intrinsics.f(this.f52595x, model.f52595x) && this.f52596y == model.f52596y && this.z == model.z && this.A == model.A && Intrinsics.f(this.B, model.B) && Intrinsics.f(this.C, model.C) && this.D == model.D && Intrinsics.f(this.E, model.E) && this.F == model.F && this.G == model.G && this.H == model.H && this.I == model.I && this.J == model.J && this.K == model.K && this.L == model.L && Intrinsics.f(this.M, model.M) && this.N == model.N && Intrinsics.f(this.O, model.O) && Intrinsics.f(this.P, model.P) && Intrinsics.f(this.Q, model.Q) && Intrinsics.f(this.R, model.R) && Intrinsics.f(this.S, model.S) && Intrinsics.f(this.T, model.T) && Intrinsics.f(this.U, model.U) && Intrinsics.f(this.V, model.V) && this.W == model.W && this.X == model.X && this.Y == model.Y && this.Z == model.Z;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51846w() {
            return this.W;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.W = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.Q;
        }

        public final int hashCode() {
            int iHashCode = this.f52580a.hashCode() * 31;
            Clause clause = this.f52581b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f52582c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.d;
            int iC = j6.a.c((this.e.hashCode() + ((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31, 31, this.f);
            Clause clause4 = this.f52583g;
            int iHashCode4 = (iC + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            Clause clause5 = this.f52584h;
            int iHashCode5 = (iHashCode4 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
            Clause clause6 = this.i;
            int iHashCode6 = (iHashCode5 + (clause6 == null ? 0 : clause6.hashCode())) * 31;
            Image image = this.f52585j;
            int iHashCode7 = (this.k.hashCode() + ((iHashCode6 + (image == null ? 0 : image.hashCode())) * 31)) * 31;
            Image image2 = this.f52586l;
            int iHashCode8 = (iHashCode7 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Image image3 = this.f52587m;
            int iC2 = j6.a.c((iHashCode8 + (image3 == null ? 0 : image3.hashCode())) * 31, 31, this.f52588n);
            Integer num = this.o;
            int iHashCode9 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f52589p;
            int iC3 = j6.a.c(j6.a.c(j6.a.c((this.f52595x.hashCode() + p.a.d(j6.a.b(this.v, (this.u.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f52590q), 31, this.f52591r), 31, this.f52592s), 31, this.f52593t)) * 31, 31), 31, this.f52594w)) * 31, 31, this.f52596y), 31, this.z), 31, this.A);
            String str = this.B;
            int iHashCode10 = (iC3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num3 = this.C;
            int iHashCode11 = Boolean.hashCode(this.D) + ((iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31);
            this.E.getClass();
            int iC4 = j6.a.c(j6.a.b(this.K, j6.a.c(j6.a.c((this.H.hashCode() + j6.a.c(j6.a.c(iHashCode11 * 961, 31, this.F), 31, this.G)) * 31, 31, this.I), 31, this.J), 31), 31, this.L);
            Clause clause7 = this.M;
            int iHashCode12 = (this.N.hashCode() + ((iC4 + (clause7 == null ? 0 : clause7.hashCode())) * 31)) * 961;
            String str2 = this.O;
            int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Object obj2 = this.P;
            int iHashCode14 = (iHashCode13 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.Q;
            int i = h30.l.i(this.R, (iHashCode14 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.S;
            int iHashCode15 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.T;
            int iHashCode16 = (iHashCode15 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.U;
            int iHashCode17 = (iHashCode16 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.V;
            return Integer.hashCode(this.Z) + j6.a.b(this.Y, j6.a.b(this.X, j6.a.b(this.W, (iHashCode17 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51843r() {
            return this.V;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.R = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51844s() {
            return this.S;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.T = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51847x() {
            return this.X;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getZ() {
            return this.Z;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.X = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51841p() {
            return this.R;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getU() {
            return this.U;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51845t() {
            return this.T;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.V = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.Q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51848y() {
            return this.Y;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.S = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.U = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new or((Intrinsics.f(model.f52581b, this.f52581b) && model.f == this.f) ? false : true, !Intrinsics.f(model.f52582c, this.f52582c), (Intrinsics.f(model.d, this.d) && model.e == this.e) ? false : true, !Intrinsics.f(model.f52583g, this.f52583g), !Intrinsics.f(model.f52584h, this.f52584h), !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f52585j, this.f52585j), !Intrinsics.f(model.k, this.k), !Intrinsics.f(model.f52586l, this.f52586l), !Intrinsics.f(model.f52587m, this.f52587m), model.f52590q != this.f52590q, model.f52588n != this.f52588n, !Intrinsics.f(model.o, this.o), !Intrinsics.f(model.f52589p, this.f52589p), model.f52591r != this.f52591r, model.f52592s != this.f52592s, model.f52593t != this.f52593t, !Intrinsics.f(model.u, this.u), model.v != this.v, !Intrinsics.f(model.f52595x, this.f52595x), model.z != this.z || this.A, model.f52596y != this.f52596y, !Intrinsics.f(model.B, this.B), !Intrinsics.f(model.C, this.C), model.D != this.D, !Intrinsics.f(model.E, this.E), model.F != this.F, model.G != this.G, model.H != this.H, model.I != this.I, model.J != this.J, model.K != this.K, model.L != this.L, or0.b.l(model, this), model.N != this.N, false, !Intrinsics.f(model.O, this.O));
        }

        public Model(String str, Clause clause, Clause clause2, Clause clause3, rx0.j jVar, boolean z, Clause clause4, Clause clause5, Clause clause6, Image image, InputText.Companion.AbstractC0443a abstractC0443a, Image image2, Image image3, boolean z3, Integer num, Integer num2, boolean z4, boolean z6, boolean z11, boolean z12, mr mrVar, int i, List list, sr srVar, boolean z29, boolean z31, boolean z41, String str2, Integer num3, boolean z49, nr nrVar, boolean z54, boolean z74, rx0.f fVar, boolean z83, boolean z89, int i2, boolean z96, Clause clause7, r7 r7Var, String str3, Object obj2, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i3, int i5, int i6, int i21) {
            this.f52580a = str;
            this.f52581b = clause;
            this.f52582c = clause2;
            this.d = clause3;
            this.e = jVar;
            this.f = z;
            this.f52583g = clause4;
            this.f52584h = clause5;
            this.i = clause6;
            this.f52585j = image;
            this.k = abstractC0443a;
            this.f52586l = image2;
            this.f52587m = image3;
            this.f52588n = z3;
            this.o = num;
            this.f52589p = num2;
            this.f52590q = z4;
            this.f52591r = z6;
            this.f52592s = z11;
            this.f52593t = z12;
            this.u = mrVar;
            this.v = i;
            this.f52594w = list;
            this.f52595x = srVar;
            this.f52596y = z29;
            this.z = z31;
            this.A = z41;
            this.B = str2;
            this.C = num3;
            this.D = z49;
            this.E = nrVar;
            this.F = z54;
            this.G = z74;
            this.H = fVar;
            this.I = z83;
            this.J = z89;
            this.K = i2;
            this.L = z96;
            this.M = clause7;
            this.N = r7Var;
            this.O = str3;
            this.P = obj2;
            this.Q = parcelable;
            this.R = cVar;
            this.S = cVar2;
            this.T = cVar3;
            this.U = cVar4;
            this.V = cVar5;
            this.W = i3;
            this.X = i5;
            this.Y = i6;
            this.Z = i21;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Clause clause2, Clause clause3, boolean z, rx0.j jVar, boolean z3, Clause clause4, Clause clause5, Image image, InputText.Companion.AbstractC0443a abstractC0443a, Image image2, Image image3, boolean z4, Integer num, Integer num2, boolean z6, boolean z11, boolean z12, boolean z29, mr mrVar, int i, List list, sr srVar, boolean z31, boolean z41, String str, Integer num3, boolean z49, List list2, boolean z54, boolean z74, rx0.f fVar, boolean z83, boolean z89, int i2, boolean z96, boolean z100, String str2, Object obj2, Clause clause6, r7 r7Var, int i3, int i5, int i6, int i21, int i22, int i32) {
            int i33;
            sr style;
            boolean z101;
            rx0.f backgroundStateList;
            Clause clause7 = (i22 & 2) != 0 ? null : clause;
            Clause clause8 = (i22 & 4) != 0 ? null : clause2;
            Clause clause9 = (i22 & 8) != 0 ? null : clause3;
            boolean z102 = (i22 & 16) != 0 ? false : z;
            rx0.j jVar2 = (i22 & 32) != 0 ? null : jVar;
            boolean z103 = (i22 & 64) != 0 ? false : z3;
            Clause clause10 = (i22 & 128) != 0 ? null : clause4;
            Clause clause11 = (i22 & 256) != 0 ? null : clause5;
            Image image4 = (i22 & 1024) != 0 ? null : image;
            InputText.Companion.AbstractC0443a prefixImageMode = (i22 & 2048) != 0 ? InputText.Companion.AbstractC0443a.C0444a.f59115a : abstractC0443a;
            Image image5 = (i22 & 4096) != 0 ? null : image2;
            Image image6 = (i22 & 8192) != 0 ? null : image3;
            boolean z104 = (i22 & 16384) != 0 ? false : z4;
            Integer num4 = (i22 & 32768) != 0 ? null : num;
            Integer num5 = (65536 & i22) != 0 ? null : num2;
            boolean z105 = (131072 & i22) != 0 ? false : z6;
            boolean z106 = (262144 & i22) != 0 ? true : z11;
            boolean z107 = (i22 & 524288) != 0 ? z106 : z12;
            boolean z108 = (i22 & PKIFailureInfo.badCertTemplate) != 0 ? z106 : z29;
            mr inputType = (i22 & PKIFailureInfo.badSenderNonce) != 0 ? new lr(16385) : mrVar;
            int i43 = (4194304 & i22) != 0 ? 0 : i;
            List editorActions = (8388608 & i22) != 0 ? zhm.f0.f322471a : list;
            if ((i22 & 16777216) != 0) {
                i33 = 32768;
                style = rr.f166227a;
            } else {
                i33 = 32768;
                style = srVar;
            }
            boolean z109 = (i22 & 33554432) != 0 ? true : z31;
            boolean z110 = (i22 & 67108864) != 0 ? false : z41;
            String str3 = (i22 & 134217728) != 0 ? null : str;
            Integer num6 = (i22 & 268435456) != 0 ? null : num3;
            boolean z111 = (i22 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z49;
            List inputFilters = (i22 & 1073741824) != 0 ? zhm.f0.f322471a : list2;
            boolean z112 = (i22 & Integer.MIN_VALUE) != 0 ? false : z54;
            boolean z113 = (i32 & 1) != 0 ? false : z74;
            if ((i32 & 2) != 0) {
                z101 = z102;
                backgroundStateList = rx0.f.DEFAULT;
            } else {
                z101 = z102;
                backgroundStateList = fVar;
            }
            boolean z114 = (i32 & 4) != 0 ? true : z83;
            boolean z115 = (i32 & 8) != 0 ? true : z89;
            int i59 = (i32 & 16) != 0 ? 0 : i2;
            boolean z116 = (i32 & 32) != 0 ? false : z96;
            boolean z117 = (i32 & 64) != 0 ? false : z100;
            rx0.j jVar3 = jVar2;
            String str4 = (i32 & 256) != 0 ? null : str2;
            Object obj3 = (i32 & 512) != 0 ? null : obj2;
            Clause clause12 = (i32 & 1024) != 0 ? null : clause6;
            r7 groupingMode = (i32 & 2048) != 0 ? r7.MULTIPLE : r7Var;
            Clause clause13 = clause7;
            int i66 = (i32 & 4096) != 0 ? R$attr.uikit_dp0 : i3;
            int i74 = (i32 & 8192) != 0 ? R$attr.uikit_dp0 : i5;
            int i92 = (i32 & 16384) != 0 ? R$attr.uikit_dp0 : i6;
            int i96 = (i32 & i33) != 0 ? R$attr.uikit_dp0 : i21;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(prefixImageMode, "prefixImageMode");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            Intrinsics.checkNotNullParameter(editorActions, "editorActions");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
            Intrinsics.checkNotNullParameter(backgroundStateList, "backgroundStateList");
            Intrinsics.checkNotNullParameter(groupingMode, "groupingMode");
            if (jVar3 == null) {
                jVar3 = z101 ? rx0.j.Inline : rx0.j.OnFocus;
            }
            sr srVar2 = style;
            this(listId, clause13, clause8, clause9, jVar3, z103, clause10, clause11, null, image4, prefixImageMode, image5, image6, z104, num4, num5, z105, z106, z107, z108, inputType, i43, editorActions, srVar2, z109, z110, z116, str3, num6, z111, new nr(inputFilters), z112, z113, backgroundStateList, z114, z115, i59, z117, clause12, groupingMode, str4, obj3, null, c.d.f249513a, null, null, null, null, i66, i74, i92, i96);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Clause clause2, Clause clause3, boolean z, Clause clause4, Clause clause5, Image image, InputText.Companion.AbstractC0443a.b bVar, ResourceImage resourceImage, ResourceImage resourceImage2, boolean z3, Integer num, Integer num2, boolean z4, boolean z6, int i, int i2, sr srVar, boolean z11, boolean z12, String str, boolean z29, List list, boolean z31, boolean z41, boolean z49, Object obj2, Clause clause6, int i3, int i5, int i6) {
            Clause clause7 = (i5 & 2) != 0 ? null : clause;
            Clause clause8 = (i5 & 4) != 0 ? null : clause2;
            Clause clause9 = (i5 & 8) != 0 ? null : clause3;
            boolean z54 = (i5 & 16) != 0 ? false : z;
            Clause clause10 = (i5 & 128) != 0 ? null : clause4;
            Clause clause11 = (i5 & 256) != 0 ? null : clause5;
            Image image2 = (i5 & 1024) != 0 ? null : image;
            InputText.Companion.AbstractC0443a prefixImageMode = (i5 & 2048) != 0 ? InputText.Companion.AbstractC0443a.C0444a.f59115a : bVar;
            ResourceImage resourceImage3 = (i5 & 4096) != 0 ? null : resourceImage;
            ResourceImage resourceImage4 = (i5 & 8192) != 0 ? null : resourceImage2;
            boolean z74 = (i5 & 16384) != 0 ? false : z3;
            Integer num3 = (32768 & i5) != 0 ? null : num;
            Integer num4 = (65536 & i5) != 0 ? null : num2;
            boolean z83 = (131072 & i5) != 0 ? false : z4;
            boolean z89 = (262144 & i5) != 0 ? true : z6;
            int i21 = (4194304 & i5) != 0 ? 0 : i2;
            zhm.f0 editorActions = zhm.f0.f322471a;
            sr style = (16777216 & i5) != 0 ? rr.f166227a : srVar;
            boolean z96 = (33554432 & i5) != 0 ? true : z11;
            boolean z100 = (67108864 & i5) != 0 ? false : z12;
            String str2 = (134217728 & i5) != 0 ? null : str;
            Integer num5 = (268435456 & i5) != 0 ? null : 1;
            boolean z101 = (536870912 & i5) != 0 ? false : z29;
            List inputFilters = (1073741824 & i5) != 0 ? editorActions : list;
            boolean z102 = (i5 & Integer.MIN_VALUE) != 0 ? false : z31;
            boolean z103 = (i6 & 1) == 0;
            rx0.f backgroundStateList = rx0.f.DEFAULT;
            boolean z104 = (i6 & 4) != 0;
            boolean z105 = (i6 & 8) != 0 ? true : z41;
            boolean z106 = (i6 & 64) != 0 ? false : z49;
            Object obj3 = (i6 & 512) != 0 ? null : obj2;
            Clause clause12 = (i6 & 1024) != 0 ? null : clause6;
            r7 groupingMode = r7.MULTIPLE;
            int i22 = R$attr.uikit_dp0;
            int i32 = (i6 & 8192) != 0 ? i22 : i3;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(prefixImageMode, "prefixImageMode");
            Intrinsics.checkNotNullParameter(editorActions, "editorActions");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
            Intrinsics.checkNotNullParameter(backgroundStateList, "backgroundStateList");
            Intrinsics.checkNotNullParameter(groupingMode, "groupingMode");
            sr srVar2 = style;
            rx0.j jVar = z54 ? rx0.j.Inline : rx0.j.OnFocus;
            this(listId, clause7, clause8, clause9, false, jVar, false, clause10, clause11, image2, prefixImageMode, resourceImage3, resourceImage4, z74, num3, num4, z83, z89, z89, z89, new lr(i), i21, editorActions, srVar2, z96, z100, str2, num5, z101, inputFilters, z102, z103, backgroundStateList, z104, z105, 0, false, z106, null, obj3, clause12, groupingMode, i22, i32, i22, i22, 16, 0);
        }
    }
}
