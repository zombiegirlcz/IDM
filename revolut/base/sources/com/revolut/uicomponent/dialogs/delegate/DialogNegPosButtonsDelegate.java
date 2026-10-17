package com.revolut.uicomponent.dialogs.delegate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.dialogs.delegate.DialogNegPosButtonsDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ss4.a0;
import syl.f;
import syl.g;
import syl.h;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/uicomponent/dialogs/delegate/DialogNegPosButtonsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lsyl/h;", "Lsyl/f;", "syl/g", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class DialogNegPosButtonsDelegate extends BaseRecyclerViewDelegate<h, f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f107161c;

    public DialogNegPosButtonsDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(f holder, final h data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f266705g;
        TextView textView2 = holder.f;
        CharSequence charSequence = data.f266707b;
        if (charSequence != null) {
            textView2.setText(charSequence);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        textView.setText(data.f266706a);
        final int i2 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: syl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DialogNegPosButtonsDelegate f266703b;

            {
                this.f266703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        g gVar = this.f266703b.f107161c;
                        if (gVar != null) {
                            gVar.b(data);
                        }
                        break;
                    default:
                        g gVar2 = this.f266703b.f107161c;
                        if (gVar2 != null) {
                            gVar2.a(data);
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: syl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DialogNegPosButtonsDelegate f266703b;

            {
                this.f266703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        g gVar = this.f266703b.f107161c;
                        if (gVar != null) {
                            gVar.b(data);
                        }
                        break;
                    default:
                        g gVar2 = this.f266703b.f107161c;
                        if (gVar2 != null) {
                            gVar2.a(data);
                        }
                        break;
                }
            }
        });
    }

    public DialogNegPosButtonsDelegate(g gVar) {
        super(R$layout.delegate_dialog_neg_pos, new a0(27));
        this.f107161c = gVar;
    }
}
