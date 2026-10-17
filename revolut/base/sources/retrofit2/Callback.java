package retrofit2;

/* JADX INFO: loaded from: classes13.dex */
public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th10);

    void onResponse(Call<T> call, Response<T> response);
}
