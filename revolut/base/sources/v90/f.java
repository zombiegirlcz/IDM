package v90;

import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.BackendCardPhotoItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CameraUploadItem;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardInputItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.DayPickerItem;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.EditableListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import com.revolut.feature.backend_flow.domain.models.FilesUploadItem;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.HtmlItem;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.IconizedSingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import com.revolut.feature.backend_flow.domain.models.MailItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.MonthPickerItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.SingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.StarRatingInputItem;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import com.revolut.feature.backend_flow.domain.models.TableItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.TextItem;
import com.revolut.feature.backend_flow.domain.models.TimeInputItem;
import com.revolut.feature.backend_flow.domain.models.TitleValueItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.backend_flow.domain.models.YearPickerItem;
import com.revolut.feature.backend_flow.domain.models.YesNoInputItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import q90.b1;
import q90.b3;
import q90.b4;
import q90.c4;
import q90.d1;
import q90.d2;
import q90.e0;
import q90.e4;
import q90.f0;
import q90.f1;
import q90.g0;
import q90.g1;
import q90.h0;
import q90.h1;
import q90.i1;
import q90.i2;
import q90.i3;
import q90.j0;
import q90.j3;
import q90.k0;
import q90.k3;
import q90.l2;
import q90.l3;
import q90.m1;
import q90.n0;
import q90.n3;
import q90.n4;
import q90.o1;
import q90.o4;
import q90.p2;
import q90.q2;
import q90.r1;
import q90.r3;
import q90.s2;
import q90.t1;
import q90.t3;
import q90.u0;
import q90.u1;
import q90.u2;
import q90.v;
import q90.v3;
import q90.w0;
import q90.w1;
import q90.x0;
import q90.x3;
import q90.y2;
import q90.z3;
import u90.d0;
import u90.q;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f286955a;

    public f(d0 itemsMapperProvider) {
        Intrinsics.checkNotNullParameter(itemsMapperProvider, "itemsMapperProvider");
        this.f286955a = itemsMapperProvider;
    }

    public final BackendItem c(v item, List previousElements) {
        q qVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        d0 d0Var = this.f286955a;
        u90.c cVar = d0Var.f278300b;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        if (item instanceof b3) {
            cVar = d0Var.f278298a;
        } else if (item instanceof w1) {
            cVar = d0Var.I;
        } else if (item instanceof t1) {
            cVar = d0Var.z;
        } else if (item instanceof c4) {
            cVar = d0Var.J;
        } else if (item instanceof k0) {
            cVar = d0Var.L;
        } else if (item instanceof n0) {
            cVar = d0Var.M;
        } else if (item instanceof g0) {
            cVar = d0Var.R;
        } else if (item instanceof j0) {
            cVar = d0Var.S;
        } else if (item instanceof m1) {
            cVar = d0Var.B;
        } else if (item instanceof f0) {
            cVar = d0Var.C;
        } else if (item instanceof q90.c) {
            cVar = d0Var.T;
        } else if (item instanceof n4) {
            cVar = d0Var.U;
        } else if (item instanceof u2) {
            cVar = d0Var.V;
        } else if (item instanceof o1) {
            cVar = d0Var.W;
        } else if (item instanceof g1) {
            cVar = d0Var.X;
        } else if (item instanceof f1) {
            cVar = d0Var.Y;
        } else if (item instanceof i1) {
            cVar = d0Var.Z;
        } else if (item instanceof d1) {
            cVar = d0Var.f278299a0;
        } else if (item instanceof y2) {
            cVar = d0Var.f278314w;
        } else if (item instanceof r3) {
            cVar = d0Var.F;
        } else if (item instanceof i2) {
            cVar = d0Var.G;
        } else if (item instanceof t3) {
            cVar = d0Var.f278308n;
        } else if (item instanceof r1) {
            cVar = d0Var.f278306l;
        } else if (item instanceof s2) {
            cVar = d0Var.f;
        } else if (item instanceof x3) {
            cVar = d0Var.f278304h;
        } else if (item instanceof b4) {
            cVar = d0Var.f278307m;
        } else if (item instanceof d2) {
            cVar = d0Var.o;
        } else if (item instanceof h0) {
            cVar = d0Var.f278309p;
        } else if (item instanceof o4) {
            cVar = d0Var.f278310q;
        } else if (item instanceof b1) {
            cVar = d0Var.f278305j;
        } else if (item instanceof p2) {
            cVar = d0Var.d;
        } else if (item instanceof l2) {
            cVar = d0Var.f278303g;
        } else if (item instanceof n3) {
            cVar = d0Var.f278316y;
        } else if (item instanceof i3) {
            cVar = d0Var.N;
        } else if (item instanceof v3) {
            cVar = d0Var.i;
        } else if (item instanceof u1) {
            cVar = d0Var.A;
        } else if (item instanceof h1) {
            cVar = d0Var.f278301b0;
        } else if (item instanceof x0) {
            cVar = d0Var.f278311r;
        } else if (item instanceof z3) {
            cVar = d0Var.v;
        } else {
            if (item instanceof e0) {
                e0 e0Var = (e0) item;
                String mode = e0Var.getMode();
                int iHashCode = mode.hashCode();
                if (iHashCode == 67452) {
                    if (mode.equals("DAY")) {
                        qVar = d0Var.f278312s;
                        cVar = qVar;
                    }
                    throw new IllegalArgumentException(a0.d.s("Unknown date picker item mode=", e0Var.getMode(), " type=", o0.f186429a.b(item.getClass()).m()));
                }
                if (iHashCode == 2719805) {
                    if (mode.equals("YEAR")) {
                        qVar = d0Var.u;
                        cVar = qVar;
                    }
                    throw new IllegalArgumentException(a0.d.s("Unknown date picker item mode=", e0Var.getMode(), " type=", o0.f186429a.b(item.getClass()).m()));
                }
                if (iHashCode == 73542240 && mode.equals("MONTH")) {
                    qVar = d0Var.f278313t;
                    cVar = qVar;
                }
                throw new IllegalArgumentException(a0.d.s("Unknown date picker item mode=", e0Var.getMode(), " type=", o0.f186429a.b(item.getClass()).m()));
            }
            if (item instanceof w0) {
                cVar = d0Var.D;
            } else if (item instanceof u0) {
                cVar = d0Var.E;
            } else if (item instanceof e4) {
                cVar = d0Var.H;
            } else if (item instanceof l3) {
                cVar = Intrinsics.f(((l3) item).getStyle(), "DROPDOWN") ? d0Var.Q : d0Var.P;
            } else if (item instanceof q2) {
                cVar = d0Var.O;
            } else if (item instanceof j3) {
                String buttonType = ((j3) item).getButtonType();
                if (buttonType != null) {
                    int iHashCode2 = buttonType.hashCode();
                    if (iHashCode2 == -1788870634) {
                        buttonType.equals("RADIO_BUTTON");
                    } else if (iHashCode2 != 45341065) {
                        if (iHashCode2 == 1841175509 && buttonType.equals("SELECT_BUTTON")) {
                            cVar = d0Var.f278302c;
                        }
                    } else if (buttonType.equals("ICONIZED")) {
                        cVar = d0Var.K;
                    }
                }
            } else if (item instanceof q90.o0) {
                cVar = d0Var.k;
            } else {
                if (!(item instanceof k3)) {
                    throw new IllegalArgumentException(j6.a.q("Unsupported item type=", o0.f186429a.b(item.getClass()).m()));
                }
                cVar = zhm.d0.o0(previousElements) instanceof CheckboxItem ? d0Var.e : d0Var.f278315x;
            }
        }
        BackendItem backendItemA = cVar.a(item, previousElements);
        Intrinsics.i(backendItemA, "null cannot be cast to non-null type T of com.revolut.core.backend_flow.data.network.mappers.screens.ItemsScreenMapper.toDomain");
        return backendItemA;
    }

    public final List d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List listF0 = zhm.f0.f322471a;
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            listF0 = zhm.d0.F0(c((v) it8.next(), listF0), listF0);
        }
        return listF0;
    }

    public final v e(BackendItem item) {
        u90.c cVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = item instanceof ProductSelectionItem;
        d0 d0Var = this.f286955a;
        if (z) {
            cVar = d0Var.f278298a;
        } else if (item instanceof RadioButtonItem) {
            cVar = d0Var.f278300b;
        } else if (item instanceof SingleChoiceButtonItem) {
            cVar = d0Var.f278302c;
        } else if (item instanceof CheckboxItem) {
            cVar = d0Var.d;
        } else if (item instanceof CheckboxTextInputItem) {
            cVar = d0Var.e;
        } else if (item instanceof NoneApplyItem) {
            cVar = d0Var.f;
        } else if (item instanceof MoneyInputItem) {
            cVar = d0Var.f278303g;
        } else if (item instanceof TextItem) {
            cVar = d0Var.f278304h;
        } else if (item instanceof TextInputItem) {
            cVar = d0Var.i;
        } else if (item instanceof DocumentItem) {
            cVar = d0Var.f278305j;
        } else if (item instanceof ChooserItem) {
            cVar = d0Var.k;
        } else if (item instanceof HtmlItem) {
            cVar = d0Var.f278306l;
        } else if (item instanceof TitleValueItem) {
            cVar = d0Var.f278307m;
        } else if (item instanceof TableItem) {
            cVar = d0Var.f278308n;
        } else if (item instanceof LinkItem) {
            cVar = d0Var.o;
        } else if (item instanceof CardInputItem) {
            cVar = d0Var.f278309p;
        } else if (item instanceof YesNoInputItem) {
            cVar = d0Var.f278310q;
        } else if (item instanceof DateInputItem) {
            cVar = d0Var.f278311r;
        } else if (item instanceof DayPickerItem) {
            cVar = d0Var.f278312s;
        } else if (item instanceof MonthPickerItem) {
            cVar = d0Var.f278313t;
        } else if (item instanceof YearPickerItem) {
            cVar = d0Var.u;
        } else if (item instanceof TimeInputItem) {
            cVar = d0Var.v;
        } else if (item instanceof PhoneInputItem) {
            cVar = d0Var.f278314w;
        } else if (item instanceof RadioButtonTextInputItem) {
            cVar = d0Var.f278315x;
        } else if (item instanceof StarRatingInputItem) {
            cVar = d0Var.f278316y;
        } else if (item instanceof HtmlStringItem) {
            cVar = d0Var.z;
        } else if (item instanceof ImageItem) {
            cVar = d0Var.A;
        } else if (item instanceof FilesUploadItem) {
            cVar = d0Var.B;
        } else if (item instanceof CameraUploadItem) {
            cVar = d0Var.C;
        } else if (item instanceof CurrencySelectionItem) {
            cVar = d0Var.D;
        } else if (item instanceof CountrySelectionItem) {
            cVar = d0Var.E;
        } else if (item instanceof SummarySectionItem) {
            cVar = d0Var.F;
        } else if (item instanceof MailItem) {
            cVar = d0Var.G;
        } else if (item instanceof TransactionsSelectionItem) {
            cVar = d0Var.H;
        } else if (item instanceof InfoListItem) {
            cVar = d0Var.I;
        } else if (item instanceof TransactionCellItem) {
            cVar = d0Var.J;
        } else if (item instanceof IconizedSingleChoiceButtonItem) {
            cVar = d0Var.K;
        } else if (item instanceof CardSelectionItem) {
            cVar = d0Var.L;
        } else if (item instanceof ChipsSelectionItem) {
            cVar = d0Var.M;
        } else if (item instanceof SignatureInputItem) {
            cVar = d0Var.N;
        } else if (item instanceof MultiSelectionItem) {
            cVar = d0Var.O;
        } else if (item instanceof SingleSelectionItem) {
            cVar = d0Var.P;
        } else if (item instanceof DropDownItem) {
            cVar = d0Var.Q;
        } else if (item instanceof CardCellItem) {
            cVar = d0Var.R;
        } else if (item instanceof BackendCardPhotoItem) {
            cVar = d0Var.S;
        } else if (item instanceof AddressInputItem) {
            cVar = d0Var.T;
        } else if (item instanceof WidgetProgressionItem) {
            cVar = d0Var.U;
        } else if (item instanceof PermissionInputItem) {
            cVar = d0Var.V;
        } else if (item instanceof FiltersInputItem) {
            cVar = d0Var.W;
        } else if (item instanceof EntitiesSelectionItem) {
            cVar = d0Var.X;
        } else if (item instanceof EntitiesListItem) {
            cVar = d0Var.Y;
        } else if (item instanceof EntityCellItem) {
            cVar = d0Var.Z;
        } else if (item instanceof EditableListItem) {
            cVar = d0Var.f278299a0;
        } else {
            if (!(item instanceof EntitiesSummaryItem)) {
                throw new IllegalArgumentException(j6.a.q("Unsupported item type=", o0.f186429a.b(item.getClass()).m()));
            }
            cVar = d0Var.f278301b0;
        }
        return cVar.b(item);
    }
}
