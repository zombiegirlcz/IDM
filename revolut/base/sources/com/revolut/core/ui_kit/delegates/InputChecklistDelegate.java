package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.hq;
import ip0.iq;
import ip0.jq;
import ip0.kq;
import ip0.mq;
import ip0.zd0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0003\u0006\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/i7;", "<init>", "()V", "Model", "a", "ip0/iq", "ip0/jq", "ip0/kq", "TextData", "com/revolut/core/ui_kit/delegates/h7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputChecklistDelegate extends BaseRecyclerViewDelegate<Model, i7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52518c;
    public final ihm.f d;
    public final e01.a e;
    public final Object f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$TextData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f52533b;

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
            this.f52532a = listId;
            this.f52533b = text;
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
            return Intrinsics.f(this.f52532a, textData.f52532a) && Intrinsics.f(this.f52533b, textData.f52533b);
        }

        public final int hashCode() {
            return this.f52533b.hashCode() + (this.f52532a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f52532a);
            TextUtils.writeToParcel(this.f52533b, dest, i);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.InputChecklistDelegate$a$a, reason: collision with other inner class name */
        public static final class C0408a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f52534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f52536c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0408a() {
                this(7, 0, null, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0408a)) {
                    return false;
                }
                C0408a c0408a = (C0408a) obj2;
                return Intrinsics.f(this.f52534a, c0408a.f52534a) && this.f52535b == c0408a.f52535b && this.f52536c == c0408a.f52536c;
            }

            public final int hashCode() {
                Clause clause = this.f52534a;
                return Integer.hashCode(this.f52536c) + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f52535b);
            }

            public C0408a(int i, Clause clause, boolean z) {
                this.f52534a = clause;
                this.f52535b = z;
                this.f52536c = i;
            }

            public /* synthetic */ C0408a(int i, int i2, Clause clause, boolean z) {
                this(131073, (i & 1) != 0 ? null : clause, (i & 2) != 0 ? false : z);
            }
        }

        private a() {
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f52537a;

            public b(Clause clause) {
                this.f52537a = clause;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f52537a, ((b) obj2).f52537a);
            }

            public final int hashCode() {
                Clause clause = this.f52537a;
                if (clause == null) {
                    return 0;
                }
                return clause.hashCode();
            }

            public b() {
                this(null);
            }
        }
    }

    public InputChecklistDelegate() {
        super(R$layout.internal_delegate_input_checklist, new hq(0));
        this.f52518c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
        this.f = yhm.j.c(yhm.k.NONE, new il9.p(18));
    }

    public static void r(i7 i7Var, boolean z) {
        i7Var.f54281h.setVisibility(!z ? 0 : 8);
        i7Var.i.setVisibility(!z ? 0 : 8);
        i7Var.f54282j.setVisibility(z ? 0 : 8);
        i7Var.f54284m.setVisibility(z ? 0 : 8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        i7 i7Var = new i7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_input_checklist));
        this.e.a(te0.w.a0(i7Var.f54282j.s(), new ip0.ad(i7Var, 14)), i7Var);
        ViewCompat.setAccessibilityDelegate(i7Var.f54280g, new h7(i7Var));
        ix0.c0 c0Var = ix0.c0.f169220a;
        kli.a.f(i7Var.f54281h, c0Var);
        kli.a.f(i7Var.i, c0Var);
        return i7Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        i7 i7Var = holder instanceof i7 ? (i7) holder : null;
        if (i7Var != null) {
            i7Var.f = null;
            i7Var.o = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f p() {
        return (ihm.f) this.f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.text.SpannableStringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.StringBuilder] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(i7 holder, Model data, int i, List list) {
        TextView textView;
        int i2;
        AnimatedStateListDrawable animatedStateListDrawableC;
        int i3;
        int i5;
        boolean z;
        boolean z3;
        py0.b bVar;
        TextLocalisedClause textLocalisedClause;
        ?? A;
        TextLocalisedClause textLocalisedClause2;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView2 = holder.f54281h;
        holder.f = data;
        ImageView imageView = holder.k;
        InputText inputText = holder.f54282j;
        ImageView imageView2 = holder.f54280g;
        int size = payloads.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (!(payloads.get(i6) instanceof kq)) {
                payloads = null;
                break;
            }
            i6++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z4 = zIsEmpty;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        int i21 = 0;
        while (i21 < size2) {
            kq kqVar = (kq) payloads.get(i21);
            zIsEmpty = zIsEmpty || kqVar.d;
            z4 = z4 || kqVar.f165060a;
            List list2 = payloads;
            z29 = z29 || kqVar.f165061b;
            z31 = z31 || kqVar.f165062c;
            z41 = z41 || kqVar.e;
            z6 = z6 || kqVar.f;
            z11 = z11 || kqVar.f165063g;
            z12 = z12 || kqVar.f165064h;
            i21++;
            payloads = list2;
        }
        if (zIsEmpty) {
            a aVar = data.e;
            Clause clause = data.f52520b;
            if (aVar instanceof a.b) {
                r(holder, false);
                or0.b.e(this, clause, textView2, new j7(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), 8);
                or0.b.e(this, ((a.b) aVar).f52537a, holder.i, new k7(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), 8);
                textView = textView2;
            } else {
                if (!(aVar instanceof a.C0408a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.C0408a c0408a = (a.C0408a) aVar;
                r(holder, true);
                if (c0408a.f52535b) {
                    InputText.Companion companion = InputText.INSTANCE;
                    inputText.C0(false);
                } else {
                    inputText.clearFocus();
                }
                inputText.setEnableQuickClear(true);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                inputText.setUnfocusedLabelColor(kli.a.s(R$attr.uikit_colorForeground, context));
                inputText.setLabel(c0408a.f52534a);
                textView = textView2;
                InputText.setText$default(inputText, clause, false, 2, null);
                inputText.setInputType(c0408a.f52536c);
                inputText.setInputBackgroundVisible(false);
                inputText.getInnerEditText().setOnTouchListener(new ar0.a(this, data, 6));
            }
        } else {
            textView = textView2;
        }
        if (z4) {
            ty0.c.b(or0.u.k(textView).b0(), data.f52520b, holder.f54281h, new l7(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), null, 8);
            InputText.setText$default(inputText, data.f52520b, false, 2, null);
        }
        if (z6) {
            imageView.setVisibility(data.f52523h != null ? 0 : 8);
            yy0.f.e(or0.u.k(imageView).Q(), data.f52523h, holder.k, null, null, 12);
        }
        if (z11 || z12) {
            iq iqVar = data.f;
            jq jqVar = data.f52522g;
            if (holder.f54285n != iqVar || holder.o != jqVar) {
                holder.f54285n = iqVar;
                holder.o = jqVar;
                imageView2.setSelected(false);
                int[] iArr = mq.f165415b;
                int i22 = iArr[iqVar.ordinal()];
                if (i22 == 1) {
                    i2 = R$drawable.uikit_icn_24_radiobutton_off;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$drawable.uikit_icn_24_checkbox_off;
                }
                imageView2.setBackgroundResource(i2);
                Context context2 = imageView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i32 = iArr[iqVar.ordinal()];
                if (i32 != 1) {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (jqVar != null) {
                        int i33 = mq.f165414a[jqVar.ordinal()];
                        if (i33 == 1) {
                            i5 = R$drawable.uikit_icn_24_check_success;
                        } else {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = R$drawable.uikit_icn_24_cross_circle;
                        }
                    } else {
                        i5 = iqVar == iq.CHECK_BUTTON ? R$drawable.uikit_icn_24_checkbox_on : R$drawable.uikit_icn_24_radiobutton_on;
                    }
                    animatedStateListDrawableC = zd0.b(context2, i5, false);
                } else if (jqVar != null) {
                    int i43 = mq.f165414a[jqVar.ordinal()];
                    if (i43 == 1) {
                        i3 = R$drawable.uikit_icn_24_check_success;
                    } else {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = R$drawable.uikit_icn_24_cross_circle;
                    }
                    animatedStateListDrawableC = zd0.b(context2, i3, false);
                } else {
                    animatedStateListDrawableC = zd0.c(context2);
                }
                imageView2.setImageDrawable(animatedStateListDrawableC);
                imageView2.jumpDrawablesToCurrentState();
            }
        }
        if (z12 || z31) {
            jq jqVar2 = data.f52522g;
            boolean z49 = data.d;
            Context context3 = holder.itemView.getContext();
            Intrinsics.h(context3);
            knm.b.A(kli.a.s(R$attr.uikit_colorGreyTone20, context3), imageView2);
            rd0.e.q(imageView2, Integer.valueOf(kli.a.s(jqVar2 == jq.POSITIVE ? R$attr.uikit_colorPerformancePositive : jqVar2 == jq.NEGATIVE ? R$attr.uikit_colorPerformanceNegative : z49 ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorGreyTone20, context3)));
        }
        if (z11 || z29 || z12) {
            boolean z54 = data.f52522g != null || data.f52521c;
            boolean z74 = (z29 || z12) && !z11;
            imageView2.setSelected(z54);
            if (!z74) {
                imageView2.jumpDrawablesToCurrentState();
            }
        }
        if (!z31) {
            z = false;
        } else if (data.d) {
            holder.itemView.setOnClickListener(new ap0.f(holder, this, 29));
            z = false;
        } else {
            holder.itemView.setOnClickListener(null);
            z = false;
            holder.itemView.setClickable(false);
        }
        if (z4 || z29 || z11 || z12) {
            pd.b.p(imageView2, data.f52520b);
            jq jqVar3 = data.f52522g;
            int i59 = jqVar3 == null ? -1 : mq.f165414a[jqVar3.ordinal()];
            if (i59 != -1) {
                z3 = true;
                if (i59 == 1) {
                    bVar = null;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.uikit_input_checklist_feedback_positive_accessibility_label, null, null, 14);
                } else {
                    if (i59 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = null;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.uikit_input_checklist_feedback_negative_accessibility_label, null, null, 14);
                }
                textLocalisedClause = textLocalisedClause2;
            } else {
                z3 = true;
                bVar = null;
                textLocalisedClause = null;
            }
            if (textLocalisedClause != null) {
                View view = holder.itemView;
                ty0.c cVarX = h30.l.x(view, "itemView", view);
                Context context4 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                A = ty0.c.a(cVarX, textLocalisedClause, context4, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            } else {
                A = bVar;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                imageView2.setStateDescription(A);
            } else if (A != 0) {
                imageView2.setContentDescription(A + ", " + imageView2.getContentDescription());
            }
        } else {
            z3 = true;
            bVar = null;
        }
        if (z41) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        }
        fp0.p pVar = holder.f54283l;
        boolean z83 = data.d;
        Image image = data.f52523h;
        boolean z89 = (!z83 || image == null) ? z : z3;
        if (image != null) {
            bVar = new py0.b(image);
        }
        py0.b bVar2 = bVar;
        fp0.p.b(pVar, z89);
        View view2 = pVar.f137029a;
        or0.m.a(view2);
        if (z89) {
            view2.setOnClickListener(new au0.i3(data, bVar2, this, data, 29));
        } else {
            or0.u.o(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52521c;
        public final boolean d;
        public final a e;
        public final iq f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final jq f52522g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f52523h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52524j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52525l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52526m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52527n;
        public qv0.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52531s;

        public Model(String listId, Clause text, boolean z, boolean z3, a type, iq checkType, jq jqVar, Image image, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(checkType, "checkType");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52519a = listId;
            this.f52520b = text;
            this.f52521c = z;
            this.d = z3;
            this.e = type;
            this.f = checkType;
            this.f52522g = jqVar;
            this.f52523h = image;
            this.i = obj2;
            this.f52524j = parcelable;
            this.k = i;
            this.f52525l = i2;
            this.f52526m = i3;
            this.f52527n = i5;
            this.o = positionInBox;
            this.f52528p = cVar;
            this.f52529q = cVar2;
            this.f52530r = cVar3;
            this.f52531s = cVar4;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new InputChecklistDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55000l() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.f52519a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52519a, model.f52519a) && Intrinsics.f(this.f52520b, model.f52520b) && this.f52521c == model.f52521c && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f52522g == model.f52522g && Intrinsics.f(this.f52523h, model.f52523h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52524j, model.f52524j) && this.k == model.k && this.f52525l == model.f52525l && this.f52526m == model.f52526m && this.f52527n == model.f52527n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52528p, model.f52528p) && Intrinsics.f(this.f52529q, model.f52529q) && Intrinsics.f(this.f52530r, model.f52530r) && Intrinsics.f(this.f52531s, model.f52531s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52815m() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f52524j;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + j6.a.c(j6.a.c(p.a.a(this.f52519a.hashCode() * 31, 31, this.f52520b), 31, this.f52521c), 31, this.d)) * 31)) * 31;
            jq jqVar = this.f52522g;
            int iHashCode2 = (iHashCode + (jqVar == null ? 0 : jqVar.hashCode())) * 31;
            Image image = this.f52523h;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Object obj2 = this.i;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52524j;
            int i = h30.l.i(this.o, j6.a.b(this.f52527n, j6.a.b(this.f52526m, j6.a.b(this.f52525l, j6.a.b(this.k, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52528p;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52529q;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52530r;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52531s;
            return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF() {
            return this.f52531s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.o = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52493g() {
            return this.f52528p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52529q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52816n() {
            return this.f52525l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52817p() {
            return this.f52527n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52525l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52498n() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52530r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52494h() {
            return this.f52529q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52531s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52524j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f52526m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52528p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52530r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Model model;
            boolean z;
            boolean z3;
            boolean z4;
            Model model2;
            boolean z6;
            boolean z11;
            boolean z12;
            boolean z29;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model3 = (Model) oldItem;
            boolean z31 = true;
            boolean z41 = !Intrinsics.f(this.f52520b, model3.f52520b);
            if (this.f52521c != model3.f52521c) {
                model = model3;
                z = z41;
                z3 = true;
            } else {
                model = model3;
                z = z41;
                z3 = false;
            }
            if (this.d != model.d) {
                z4 = true;
            } else {
                z4 = true;
                z31 = false;
            }
            boolean zF = Intrinsics.f(this.e, model.e) ^ z4;
            boolean zL = or0.b.l(this, (qv0.i) oldItem);
            boolean zF2 = Intrinsics.f(this.f52523h, model.f52523h) ^ z4;
            if (this.f != model.f) {
                model2 = model;
                z6 = zF;
                z11 = z4;
            } else {
                model2 = model;
                z6 = zF;
                z11 = false;
            }
            if (this.f52522g != model2.f52522g) {
                z29 = zF2;
                z12 = z4;
            } else {
                z12 = false;
                z29 = zF2;
            }
            return new kq(z, z3, z31, z6, zL, z29, z11, z12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Model(String str, Clause clause, boolean z, boolean z3, a aVar, iq iqVar, jq jqVar, ResourceImage resourceImage, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5) {
            boolean z4 = (i5 & 8) != 0 ? true : z3;
            a bVar = (i5 & 16) != 0 ? new a.b(null) : aVar;
            jq jqVar2 = (i5 & 64) != 0 ? null : jqVar;
            ResourceImage resourceImage2 = (i5 & 128) != 0 ? null : resourceImage;
            Object obj3 = (i5 & 256) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i5 & 512) != 0 ? null : analyticsContext;
            int i6 = (i5 & 1024) != 0 ? R$attr.uikit_dp0 : i;
            int i21 = R$attr.uikit_dp0;
            this(str, clause, z, z4, bVar, iqVar, jqVar2, resourceImage2, obj3, analyticsContext2, i6, i21, (i5 & 4096) != 0 ? i21 : i2, (i5 & 8192) != 0 ? i21 : i3, c.d.f249513a, null, null, null, null);
        }
    }
}
